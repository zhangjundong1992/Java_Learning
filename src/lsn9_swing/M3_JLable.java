package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M3_JLable extends JFrame {
    public static void main(String[] args) {
        new M3_JLable();
    }

    private M3_JLable() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        setVisible(true);

        JLabel label=new JLabel("这是一个标签");
        label.setText("修改过后的内容");
        System.out.println(label.getText());
        label.setFont(new Font("微软雅黑",Font.BOLD,20));
        label.setForeground(Color.red);

        container.add(label);
    }
}
