package lsn9_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class M14_FocusListener extends JFrame {
    public static void main(String[] args) {
        new M14_FocusListener();
    }

    private M14_FocusListener() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JTextField jtf1 = new JTextField();
        jtf1.setColumns(20);
        jtf1.setFont(new Font("楷体", Font.PLAIN, 18));
        jtf1.addFocusListener(new MyFocusListener());
        container.add(jtf1);

        JTextField jtf2 = new JTextField();
        jtf2.setColumns(20);
        jtf2.setFont(new Font("楷体", Font.PLAIN, 18));
        jtf2.addFocusListener(new MyFocusListener());
        container.add(jtf2);

        setVisible(true);
    }

    static class MyFocusListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            JTextField jtf = (JTextField) e.getSource();
            jtf.setForeground(Color.black);
        }

        @Override
        public void focusLost(FocusEvent e) {
            JTextField jtf = (JTextField) e.getSource();
            jtf.setForeground(Color.gray);
        }
    }
}
