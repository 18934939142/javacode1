package 课本代码.project9.wuziqi;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessPint_white extends Canvas implements MouseListener {
    ChessPad cp=null;
    ChessPint_white(ChessPad cp){
        this.cp=cp;
        addMouseListener(this);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillOval(0,0,14,14);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
