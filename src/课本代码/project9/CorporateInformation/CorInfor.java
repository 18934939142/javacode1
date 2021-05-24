package 课本代码.project9.CorporateInformation;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 企业信息调查表
 * @author mojiangze
 */
public class CorInfor extends Frame {
    Label lb1=new Label("企业名称:");
    Label lb2=new Label("注册资金:");
    Label lb3=new Label("员工数量:");
    Label lb4=new Label("从事行业:");
    Label lb5=new Label("年营业额:");
    Label lb6=new Label("利润率:");
    TextField txt1=new TextField();
    TextField txt2=new TextField();
    TextField txt3=new TextField();
    TextField txt4=new TextField();
    TextField txt5=new TextField();
    TextField txt6=new TextField();
    Button button=new Button("提交");
    //
    public CorInfor(String title) throws HeadlessException {
        super(title);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        lb1.setBounds(40,40,85,20);
        txt1.setBounds(100,40,115,20);
        this.add(txt1);
        lb2.setBounds(40,75,85,20);
        txt2.setBounds(100,75,115,20);
        this.add(txt2);
        lb3.setBounds(40,105,85,20);
        txt3.setBounds(100,105,115,20);

        txt3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                System.out.println(keyChar);
                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){
                }else{
                    e.consume(); //关键，屏蔽掉非法输入
                }
            }
        });
        this.add(txt3);
        lb4.setBounds(40,140,85,20);
        txt4.setBounds(100,140,115,20);
        this.add(txt4);
        lb5.setBounds(40,175,85,20);
        txt5.setBounds(100,175,115,20);
        this.add(txt5);
        lb6.setBounds(40,210,85,20);
        txt6.setBounds(100,210,115,20);
        this.add(txt6);

        this.add(lb1);
        this.add(lb2);
        this.add(lb3);
        this.add(lb4);
        this.add(lb5);
        this.add(lb6);
        this.add(button);
        button.setBounds(60,245,90,30);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CorInfor("aaa");
    }
}
