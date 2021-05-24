package 课本代码.project9;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StudenIfer extends Frame implements ActionListener, KeyListener, FocusListener {
        TextField name=new TextField(10);
        Checkbox man=new Checkbox("男"),woman=new Checkbox("女");
        CheckboxGroup sex=new CheckboxGroup();
        TextField age=new TextField("20",4);
        Choice nativeplace=new Choice();
        Checkbox like1=new Checkbox("读书");
        Checkbox like2=new Checkbox("上网");
        Checkbox like3=new Checkbox("打球");
        List web=new List(4);
        Button bt1=new Button("确认");
        Button bt2=new Button("取消");
        Button bt3=new Button("退出");
        Label lb1=new Label("个人信息");
        Label lb2=new Label("姓名");
        Label lb3=new Label("性别");
        Label lb4=new Label("年龄");
        Label lb5=new Label("爱好");
        Label lb6=new Label("喜欢到网站");
        //
    public StudenIfer(String title){
        super(title);
        this.setSize(400,400);
        this.setLayout(null);
        lb1.setBounds(150,50,100,20);
        lb2.setBounds(50,100,40,20);
        lb3.setBounds(50,150,100,20);
        lb4.setBounds(230,150,100,20);
        lb5.setBounds(50,200,100,20);
        lb6.setBounds(50,250,80,20);
        name.setBounds(90,100,100,20);
        man.setCheckboxGroup(sex);
        woman.setCheckboxGroup(sex);
        sex.setSelectedCheckbox(man);
        man.setBounds(270,100,60,20);
        woman.setBounds(330,100,60,20);
        age.setBounds(90,150,50,20);
        nativeplace.add("北京");
        nativeplace.add("广西");
        nativeplace.add("西安");
        nativeplace.add("南京");
        nativeplace.add("纽约");
        nativeplace.setBounds(270,150,60,20);
        like1.setBounds(90,200,60,20);
        like2.setBounds(150,200,60,20);
        like3.setBounds(210,200,60,20);
        web.add("baidu");
        web.add("taobao");
        web.add("google");
        web.setBounds(130,250,100,60);
        bt1.setBounds(110,330,50,20);
        bt2.setBounds(180,330,50,20);
        bt3.setBounds(250,330,50,20);

        this.add(lb1);
        this.add(lb2);
        this.add(lb3);
        this.add(lb4);
        this.add(lb5);
        this.add(lb6);
        this.add(name);
        this.add(man);
        this.add(woman);
        this.add(age);
        this.add(nativeplace);
        this.add(like1);
        this.add(like2);
        this.add(like3);
        this.add(web);
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        setLocationRelativeTo(null);



    }

    public static void main(String[] args) {
        StudenIfer stf=new StudenIfer("grxx");
        stf.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
