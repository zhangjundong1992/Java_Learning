package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M6_FlowLayout extends JFrame {
    public static void main(String[] args) {
        new M6_FlowLayout();
    }

    private M6_FlowLayout() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)); /*将容器的布局设置为流式布局*/

        for (int i = 0; i < 10; i++) {
            container.add(new JButton("按钮" + i));
        }

    }
}
