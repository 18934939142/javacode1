package 课堂作业;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        System.out.println("输入x的值:>");
        Scanner in = new Scanner(System.in);

        int x=0;
        int y=0;
        x=in.nextInt();
        if (x<1){
            System.out.println("y="+x);
        }else if (x>=1 && x<10){
            System.out.println("y="+(3*x-2));
        }
        else  if (x>=10)
        {
            System.out.println("y="+4*x);
        }

    }
}
