package lsn8_iocAndMVC.KCB;

import javax.swing.*;

public class KCB {
    public static void main(String[] args) {
        var frame=new JFrame();
        var table=new JTable(new KCBData());
        var pane=new JScrollPane(table);
        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
