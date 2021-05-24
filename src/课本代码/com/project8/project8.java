package 课本代码.com.project8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mojiangze
 */
public class project8 {
    /**
     * 创建一个窗体
     */
    static Frame f=new Frame("Java GUI 程序");
    //创建三个Lable标签
    static Label lb1=new Label("欢迎学习GUI编程！");
    static Label lb2=new Label("当前发生的按钮事件：");
    static Label lb3=new Label("按 钮 事 件 描 述");
    //创建两个按钮
    static Button bt1=new Button("会说话的按钮");
    static Button bt2=new Button("退出按钮");

    public static void main(String[] args) {
        f.setBackground(Color.orange);
        f.setBackground(Color.gray);
        f.setSize(200,200);
        f.setLayout(new FlowLayout());
        f.setResizable(true);
        lb3.setBackground(Color.CYAN);
//      添加组件进窗体
        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(bt1);
        f.add(bt2);
//
        bt1.addMouseListener(new Button1Handler());
        bt2.addActionListener(new Button2Handler());




        f.setLocationRelativeTo(null);
        f.setVisible(true);


    }




}
