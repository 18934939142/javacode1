package 课本代码.com.project8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button1Handler extends Component implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

        project8.lb3.setText("单击按钮");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        project8.lb3.setText("按下按钮");
        JFileChooser f=new JFileChooser();
        f.showOpenDialog(this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        project8.lb3.setText("离开按钮");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        project8.lb3.setText("进入按钮上方");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        project8.lb3.setText("离开按钮上方");
    }
}
