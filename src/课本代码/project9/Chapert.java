package 课本代码.project9;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Chapert extends Frame{
    private TextField txtApp=new TextField("文本域");
    private Button btn=new Button("按钮");
    //
    MouseEventHandler handler=new MouseEventHandler();
    public Chapert(String title){
        super(title);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.setSize(300,200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        txtApp.setFont(new Font("黑体",Font.PLAIN,16));
        txtApp.setBounds(0,30,300,100);
        btn.setBounds(120,150,60,30);
        //
        txtApp.addMouseListener(handler);
        btn.addMouseListener(handler);
        //
        this.add(txtApp);
        this.add(btn);
        this.setVisible(true);

    }


    private class MouseEventHandler extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            String s="坐标"+"x:"+e.getX()+"y:"+e.getY();
            if (e.getSource()==txtApp){
                System.out.println("这是文本域");
                System.out.println(s);
            }else if (e.getSource()==btn){
                System.out.println("这是按钮");
                System.out.println(s);
            }

            txtApp.setForeground(Color.red);
            txtApp.setText(s);
        }
    }

    public static void main(String[] args) {
        new Chapert("aaa");
    }
}
