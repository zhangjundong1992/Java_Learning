package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M8_GridLayout extends JFrame {
    public static void main(String[] args) {
        new M8_GridLayout();
    }

    /*注意，添加的组建超过容量后，网格会自动扩充，以增加列的形式*/
    private M8_GridLayout() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 4, 10, 10)); /*将容器的布局设置为网格布局*/

        for (int i = 0; i < 10; i++) {
            container.add(new JButton("按钮" + i));
        }
    }
}
