package 课堂作业;

import java.util.Scanner;

public class test3 {
    //输入三条边判断三角形是否有效
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1,x2,x3;
        //输入
        System.out.println("输入三条边:");
        System.out.println("输入x1:");
        x1=in.nextInt();
        System.out.println("输入x2:");
        x2=in.nextInt();
        System.out.println("输入x3:");
        x3=in.nextInt();
        //判断
        if(x1+x2<=x3 || x1+x3<=x2 || x2+x3<=x1)
        {
            System.out.println("无法组成三角形");
        }
        else
        {
            System.out.println("可以组成三角形");
        }


    }
}
