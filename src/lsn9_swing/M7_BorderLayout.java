package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M7_BorderLayout extends JFrame {
    public static void main(String[] args) {
        new M7_BorderLayout();
    }

    /*东南西北中布局*/
    private M7_BorderLayout() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new BorderLayout()); /*将容器的布局设置为边界布局，默认布局*/

        JButton btn1 = new JButton("东");
        JButton btn2 = new JButton("南");
        JButton btn3 = new JButton("西");
        JButton btn4 = new JButton("北");
        JButton btn5 = new JButton("中");

        container.add(btn1,BorderLayout.EAST);
        container.add(btn2,BorderLayout.SOUTH);
        container.add(btn3,BorderLayout.WEST);
        container.add(btn4,BorderLayout.NORTH);
        container.add(btn5,BorderLayout.CENTER);
    }
}
