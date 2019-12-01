package lsn9_swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class M4_Icon extends JFrame {
    public static void main(String[] args) {
        new M4_Icon();
    }

    private M4_Icon() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        setVisible(true);

        /*使用JLabel显示图片*/
        JLabel label = new JLabel();
        Icon icon = new ImageIcon("src\\wechat.png");
        label.setIcon(icon);

        container.add(label);
    }
}
