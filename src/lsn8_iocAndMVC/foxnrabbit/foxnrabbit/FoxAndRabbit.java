package lsn8_iocAndMVC.foxnrabbit.foxnrabbit;

import lsn8_iocAndMVC.foxnrabbit.animal.Animal;
import lsn8_iocAndMVC.foxnrabbit.animal.Fox;
import lsn8_iocAndMVC.foxnrabbit.animal.Rabbit;
import lsn8_iocAndMVC.foxnrabbit.cell.ICell;
import lsn8_iocAndMVC.foxnrabbit.field.Field;
import lsn8_iocAndMVC.foxnrabbit.field.Location;
import lsn8_iocAndMVC.foxnrabbit.field.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class FoxAndRabbit {
	private Field theField;
	private View theView;
	private JFrame frame;
	
	private FoxAndRabbit(int size) {
		theField = new Field(size, size);
		for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
				double probability = Math.random();
				if ( probability < 0.05 ) {
					theField.place(row, col, new Fox());
				} else if ( probability < 0.15 ) {
					theField.place(row, col, new Rabbit());
				} 
			}
		}
		theView = new View(theField);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(theView,BorderLayout.CENTER);
		JButton btnStep=new JButton("单步");
		frame.add(btnStep,BorderLayout.SOUTH);
		btnStep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				step();
				frame.repaint();
			}
		});

		frame.pack();
		frame.setVisible(true);
	}
	
	private void start(int steps) {
		for ( int i=0; i<steps; i++ ) {
			step();
			theView.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void step() {
		for ( int row = 0; row< theField.getHeight(); row++ ) {
			for ( int col = 0; col < theField.getWidth(); col++ ) {
				ICell cell = theField.get(row, col);
				if ( cell != null ) {
					Animal animal = (Animal)cell;
					animal.grow();
					if ( animal.isAlive() ) {
						//	move
						Location loc = animal.move(theField.getFreeNeighbour(row, col));
						if ( loc != null ) {
							theField.move(row, col, loc);
						}
						//	eat
//						animal.eat(theField);
						ICell[] neighbour = theField.getNeighbour(row, col);
						ArrayList<Animal> listRabbit = new ArrayList<Animal>();
						for ( ICell an : neighbour ) {
							if ( an instanceof Rabbit) {
								listRabbit.add((Rabbit)an);
							}
						}
						if ( !listRabbit.isEmpty() ) {
							Animal fed = animal.feed(listRabbit);
							if ( fed != null ) {
								theField.remove((ICell)fed);
							}
						}
						//	breed
						Animal baby = animal.breed();
						if ( baby != null ) {
							theField.placeRandomAdj(row, col, (ICell)baby);
						}
					} else {
						theField.remove(row, col);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FoxAndRabbit fnr = new FoxAndRabbit(50);
//		fnr.start(100);
	}

}
