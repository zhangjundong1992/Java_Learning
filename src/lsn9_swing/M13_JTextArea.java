package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M13_JTextArea extends JFrame {
    public static void main(String[] args) {
        new M13_JTextArea();
    }

    private M13_JTextArea() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());


        JTextArea jta = new JTextArea("中华人民共和国");/*文本域*/
        jta.setRows(5);
        jta.setColumns(20);
        JScrollPane jsp = new JScrollPane(jta);/*滚动面板*/
        container.add(jsp);

        setVisible(true);
    }
}
