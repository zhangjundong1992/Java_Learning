package lsn9_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M2_JDialog extends JDialog {
    public static void main(String[] args) {
        /*窗体*/
        JFrame frame = new JFrame();
        frame.setTitle("窗体标题"); /*标题*/
        frame.setVisible(true); /*可见*/
        frame.setSize(500, 500); /*设置窗体大小*/
        frame.setLocation(500, 500); /*设置坐标*/
        frame.setResizable(false); /*不可改变大小*/
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*窗体容器*/
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout()); /*布局*/

        /*按钮*/
        JButton button = new JButton("弹出对话框");
        button.setVisible(true);
        button.addActionListener(new ActionListener() { /*点击事件*/
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog dialog = new M2_JDialog();
                dialog.setModal(true);
                dialog.setVisible(true);

            }
        });
        container.add(button);
        container.validate();
    }

    private M2_JDialog() {
        /*获取容器*/
        Container container = getContentPane();
        container.setBackground(Color.white);

        /*标签*/
        JLabel label = new JLabel("这里是标签");
        container.add(label);
    }
}
