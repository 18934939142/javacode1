package 课本代码.project10.kkk;

import java.awt.*;

public class MainShow extends Frame {
    MenuBar menuBar;
    Menu menu1,menu2,menu3;
    MenuItem menuItem1,menuItem2,menuItem3;

    public MainShow() throws HeadlessException {
        setTitle("菜单栏");
        setLayout(null);
        setSize(640,480);
        menuBar=new MenuBar();
        menu1=new Menu("登陆");
        menu2=new Menu("注册");
        menu3=new Menu("退出");
        menuItem1=new MenuItem("用户名");
        menuItem2=new MenuItem("密码");
        menuItem3=new MenuItem("帮助");
        menu1.add(menu2);

        menu2.add(menuItem1);
        menu2.add(menuItem2);

        setLocationRelativeTo(null);
        menuBar.add(menu1);
       setMenuBar(menuBar);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainShow();
    }
}
