package t1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class aoo extends JFrame{

    public aoo()
    {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(50,30,450,260);
        g.drawString("大撒大撒",200,200);
        g.drawLine(-50,40,450,300);
    }
    public static void main(String[] args) {

        new aoo().setVisible(true);



    }




}
