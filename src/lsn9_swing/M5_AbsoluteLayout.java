package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M5_AbsoluteLayout extends JFrame {
    public static void main(String[] args) {
        new M5_AbsoluteLayout();
    }

    private M5_AbsoluteLayout() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(null); /*将容器的布局设置为绝对布局*/

        JButton btn1 = new JButton("按钮1");
        btn1.setBounds(10, 10, 100, 50);


        JButton btn2 = new JButton("按钮2");
        btn2.setBounds(200, 10, 150, 75);


        container.add(btn1);
        container.add(btn2);

    }
}
