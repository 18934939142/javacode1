package t3;

import java.util.Scanner;

/**
 * @author 不用减肥的大熊猫
 */
public class Login {
    //登录 注册  查看 退出
    //默认账号密码


    String[] User= {"zhangsan","lisi","wangwu","zhaoliu","","","",""};
    String[] UserPassword= {"123","321","123456","654321","","","",""};


    public Login() {

    }

    //菜单页面
    void Meum(){
        System.out.println("---------黑马功能菜单---------");
        System.out.println("*****    1.登录功能          *****    ");
        System.out.println("*****    2.注册功能          *****    ");
        System.out.println("*****    3.查看功能          *****    ");
        System.out.println("*****    0.退出功能          *****    ");
        System.out.println("--------------------------");
    }



    //登录方法
    boolean Denglu(String name,String pass){


        for (int i=0;i<User.length;i++)
        {
            //如果账号密码都相等
            if ((name.equals(User[i])==true) && (pass.equals(UserPassword[i])==true))
            {
                return true;
            }
        }
        return false;
    }
    //注册
   public  boolean zhuce(String name,String pass){
        int cont=0;
        for (int i=0;i<User.length;i++)
        {
            if (User[i].equals("")==true){
                User[i]=name;
                UserPassword[i]=pass;
                cont=i;
                break;
            }
        }
       System.out.println(User[cont]);
       System.out.println(UserPassword[cont]);
       return  true;
    }
//查看
    void show(){
        for (int i=0;i<UserPassword.length;i++){
            if (User[i].equals("")!=true)
            {
                System.out.println("账号:"+User[i]+" 密码:"+UserPassword[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Login go = new Login();

        String name="";
        String pass="";
        int index=0;
//        System.out.println(go.User[0]);
        while (true){

            go.Meum();
            index=in.nextInt();
            switch (index)
            {
                case 1:{
                    System.out.println("请输入账号:");
                    name=in.next();
                    System.out.println("请输入密码:");
                    pass=in.next();
                    boolean IS =go.Denglu(name,pass);
                    if (IS){
                        System.out.println("登录成功！！！");
                    }
                    else {
                        System.out.println("账号或密码错误！");
                    }
                }
                break;

                case 2:{
                    System.out.println("请输入注册账号:");
                    name=in.next();
                    System.out.println("请输入注册密码:");
                    pass=in.next();
                    boolean ZC=go.zhuce(name,pass);
                    if (ZC){
                        System.out.println("注册成功！！！");
                    }
                    else {
                        System.out.println("注册失败");
                    }
                }
                    break;
                case 3:go.show();
                    break;
                case 0:
                    System.out.println("退出小程序:");
                    int i = 0;
                    System.exit(i);
                    break;
                default:System.out.println("输入错误，请重新输入!");
                    break;
            }
        }


    }
}
