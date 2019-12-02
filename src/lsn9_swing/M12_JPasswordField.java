package lsn9_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M12_JPasswordField extends JFrame {
    public static void main(String[] args) {
        new M12_JPasswordField();
    }

    private M12_JPasswordField() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JPasswordField jpf = new JPasswordField();
        jpf.setColumns(20);
        jpf.setFont(new Font("Arial", Font.BOLD, 18));
        jpf.setEchoChar('*');/*设置回显字符*/
        container.add(jpf);

        JButton btn = new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jpf.getPassword());
            }
        });
        container.add(btn);


        setVisible(true);
    }
}
