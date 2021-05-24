package t1;

import javax.swing.*;
import javax.swing.table.TableModel;

public class sw {


    public static void main(String[] args) {
        JFrame frame =new JFrame();
        JTable table;
        table = new JTable(new data());
        JScrollPane pane=new JScrollPane(table);

        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600,600);

    }
}
