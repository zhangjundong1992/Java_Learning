package lsn9_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M9_JComboBox extends JFrame {
    public static void main(String[] args) {
        new M9_JComboBox();
    }

    private M9_JComboBox() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null); /*将容器的布局设置为绝对布局*/


        /*添加JComBox*/
        /*添加方式1*/
//        JComboBox<String> comboBox = new JComboBox<>();
//        comboBox.addItem("身份证");
//        comboBox.addItem("学生证");
//        comboBox.addItem("军官证");
        /*添加方式2*/
//        String[] items={"身份证","学生证","军官证"};
//        JComboBox<String> comboBox = new JComboBox<>(items);
        /*添加方式3*/
        JComboBox<String> comboBox = new JComboBox<>();
        String[] items = {"身份证", "学生证", "军官证"};
        ComboBoxModel<String> cbm = new DefaultComboBoxModel<>(items);
        comboBox.setModel(cbm);
        comboBox.setBounds(10, 10, 80, 20);
        container.add(comboBox);

        /*添加按钮*/
        JButton btn=new JButton("打印");
        btn.setBounds(10,50,80,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(comboBox.getSelectedItem());
            }
        });
        container.add(btn);


        setVisible(true);
    }
}
