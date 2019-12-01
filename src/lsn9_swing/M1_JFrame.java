package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M1_JFrame extends JFrame {
    public static void main(String[] args) {
        M1_JFrame demo = new M1_JFrame();
    }

    private M1_JFrame() {
        /*设置顶层容器*/
        setTitle("这里是标题"); /*标题*/
        setVisible(true); /*可见*/
        setDefaultCloseOperation(EXIT_ON_CLOSE); /*关闭窗口退出程序*/
        setSize(500, 500); /*设置窗体大小*/
        setLocation(500, 500); /*设置坐标*/
        setResizable(false); /*不可改变大小*/

        /*获取容器*/
        Container container = getContentPane();
        container.setBackground(Color.white);

        /*标签*/
        JLabel label = new JLabel("这里是标签");
        container.add(label);

    }


}
