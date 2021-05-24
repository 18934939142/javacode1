package 课本代码.project9.wuziqi;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Chess extends Frame {
    ChessPad cp=new ChessPad();
    Chess(){
        this.setLayout(null);
        Label lb1=new Label("单击下棋");
        lb1.setBounds(70,55,440,26);
        lb1.setBackground(Color.orange);
        add(lb1);
        add(cp);
        cp.setBounds(70,90,440,440);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(800,650);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Chess cs=new Chess();

    }
}
