package t1;

import java.util.Scanner;

public class number {
       private static int x,y;
        //构造方法 初始化
        public number(){
            x=0;
            this.y=0;
        }
        //定义方法
    int add(){
            return x+y;
    }
    int sub(){
            return x-y;
    }
    double div(){
            return 1.0*x*y;
    }
    double chufa(){
            return 1.0*x/y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        number n=new number();

        System.out.println("输入x1：");
        n.x=in.nextInt();
        System.out.println("输入x2：");
        n.y=in.nextInt();
        System.out.println(n.x+"+"+n.y+"="+n.add());
        System.out.println(n.x+"-"+n.y+"="+n.sub());
        System.out.println(n.x+"*"+n.y+"="+n.div());
        System.out.println(n.x+"/"+n.y+"="+n.chufa());
    }
}
