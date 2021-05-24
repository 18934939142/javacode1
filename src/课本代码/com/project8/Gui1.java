package 课本代码.com.project8;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gui1 {
    static Frame f = new Frame("GUI演示");
    static Label lb1=new Label("欢迎学习Java GUI");
    static Button bt1=new Button("按钮");

    public static void main(String[] args) {
        f.setBackground(Color.cyan);
        f.setForeground(Color.red);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.add(lb1);
        f.add(bt1);
        bt1.addMouseListener(new Button1Han());
        //居中显示
        f.setLocationRelativeTo(null);
        //显示窗口
        f.setVisible(true);
    }
}
class Button1Han implements MouseListener{

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {
            
    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}