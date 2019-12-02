package lsn9_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M11_JTextField extends JFrame {
    public static void main(String[] args) {
        new M11_JTextField();
    }

    private M11_JTextField() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JTextField jtf = new JTextField();
        jtf.setColumns(20);
        jtf.setFont(new Font("楷体", Font.PLAIN, 18));
        container.add(jtf);

        JButton btn = new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jtf.getText());
                jtf.setText("");/*清空文本框*/
                jtf.requestFocus();/*获取焦点*/
            }
        });
        container.add(btn);

        setVisible(true);
    }
}
