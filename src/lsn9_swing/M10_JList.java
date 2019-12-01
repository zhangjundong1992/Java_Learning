package lsn9_swing;

import javax.swing.*;
import java.awt.*;

public class M10_JList extends JFrame {
    public static void main(String[] args) {
        new M10_JList();
    }

    private M10_JList() throws HeadlessException {
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        /*添加方式1*/
//        String[] items = {"元素1", "元素2", "元素3", "元素4", "元素5", "元素6", "元素7"};
//        JList<String> jl = new JList<>(items);//

        /*添加方式2*/
        String[] items = {"元素1", "元素2", "元素3", "元素4", "元素5", "元素6", "元素7"};
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String tmp : items) {
            model.addElement(tmp);
        }
        JList<String> jl = new JList<>();
        jl.setModel(model);

        /*设置模式：单选，连续选择多个，非连续多选*/
        jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);


        /*滚动区域*/
        JScrollPane jsp = new JScrollPane(jl);
        jsp.setBounds(10, 10, 100, 100);

        container.add(jsp);


        setVisible(true);
    }
}
