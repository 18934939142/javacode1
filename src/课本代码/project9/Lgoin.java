package 课本代码.project9;

import java.awt.*;
import java.awt.event.*;
import java.net.CookieHandler;

/**
 * @author mojiangze
 */
public class Lgoin {
    Frame app=new Frame("登陆");
    Label lbName=new Label("用户名：");
    Label lbPass=new Label("密码：");
    Label lbCho=new Label("");
    static TextField txtName=new TextField();
    static TextField txtPass=new TextField();
    Button bt1=new Button("登录");
    //
    public Lgoin(){
        app.setSize(300,200);
        app.setLayout(null);
        //设置用户名到位置和大小
        lbName.setBounds(60,50,70,20);
        txtName.setBounds(135,50,100,20);
        //为文本框添加事件监听器
        txtName.addKeyListener(new keyHandler());
        txtName.addFocusListener(new focusHandler());
        //密码框设置位置大小
        lbPass.setBounds(60,90,70,20);
        txtPass.setBounds(135,90,100,20);
        //密码监听事件
        txtPass.addKeyListener(new keyHandler());
        txtPass.addFocusListener(new focusHandler());
        txtPass.setEchoChar('*');
        //
        bt1.setBounds(135,135,80,20);
        bt1.addMouseListener(new moudeHandler());
        lbCho.setBounds(135,155,80,20);
        //添加组件进窗体
        app.add(lbCho);
        app.add(lbName);
        app.add(lbPass);
        app.add(txtName);
        app.add(txtPass);
        app.add(bt1);
        app.setLocation(600,100);
        app.setVisible(true);

    }

    public static void main(String[] args) {
     Lgoin log=  new Lgoin();
    }


    private class keyHandler implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
//                Object ob=e.getSource();
//                if ((ob==Lgoin.txtName)&&(e.getKeyCode()>=0)){
//                    System.out.println("用户名:"+Lgoin.txtName.getText());
//                }else if ((ob==Lgoin.txtPass)&&(e.getKeyCode()>0)){
//                    System.out.println("密码:"+Lgoin.txtPass.getText());
//                }
        }

        /**
         * 释放某按键到事件
         * @param e
         */
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class focusHandler implements FocusListener {
        //获取鼠标焦点时
        @Override
        public void focusGained(FocusEvent e) {

        }
//      失去鼠标焦点时
        @Override
        public void focusLost(FocusEvent e) {
            Object ob=e.getSource();
            if (ob==Lgoin.txtName){
                System.out.println("用户名:"+Lgoin.txtName.getText());
            }else if (ob==Lgoin.txtPass){
                System.out.println("密码:"+Lgoin.txtPass.getText());
            }
        }
    }

    private class moudeHandler implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            lbCho.setText("登陆成功");
            lbCho.setBackground(Color.CYAN);
            System.out.println(Lgoin.txtName.getText());
            System.out.println(Lgoin.txtPass.getText());
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
}
