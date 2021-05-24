package 课堂作业;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("输入密文:");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char[] sch=s.toCharArray();
        char m='j';
        System.out.print("密文:");
        for (int i=0;i<sch.length;i++){
            sch[i]=(char)(sch[i]^m);
            System.out.print(sch[i]);
        }
        System.out.println();
        System.out.print("明文:");
        for (int i=0;i<sch.length;i++){
            sch[i]=(char)(sch[i]^m);
            System.out.print(sch[i]);
        }
    }
}
