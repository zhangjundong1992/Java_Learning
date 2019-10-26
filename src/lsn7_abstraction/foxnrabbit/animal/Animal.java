package lsn7_abstraction.foxnrabbit.animal;

import java.util.ArrayList;

import lsn7_abstraction.foxnrabbit.cell.ICell;
import lsn7_abstraction.foxnrabbit.field.Location;

public abstract class Animal implements ICell {
	private int ageLimit;
	private int breedableAge;
	private int age;
	private boolean isAlive = true;
	
	Animal(int ageLimit, int breedableAge) {
		this.ageLimit = ageLimit;
		this.breedableAge = breedableAge;
	}
	
	protected int getAge() {
		return age;
	}
	
	double getAgePercent() {
		return (double)age/ageLimit;
	}
	
	public abstract Animal breed();
	
	public void grow() {
		age++;
		if ( age >= ageLimit ) {
			die();
		}
	}
	
	private void die() {
		isAlive = false;
	}
	
	public boolean isAlive() { 
		return isAlive; 
	}
	
	boolean isBreedable() {
		return age >= breedableAge;
	}
	
	public Location move(Location[] freeAdj) {
		Location ret = null;
		if ( freeAdj.length>0 && Math.random() < 0.02 ) {
			ret = freeAdj[(int)(Math.random()*freeAdj.length)];
		}
		return ret;
	}
	
	@Override
	public String toString() {
		return ""+age+":"+(isAlive?"live":"dead");
	}

	public Animal feed(ArrayList<Animal> neighbour) {
		return null;
	}
	
	void longerLife(int inc) {
		ageLimit += inc;
	}
}
