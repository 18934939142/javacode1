package 课堂作业;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;

        while(true){
            System.out.println("输入数字1-7(0退出)：");
            n=in.nextInt();
            switch (n){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:System.out.println("Tuesday");
                    break;
                case 3:System.out.println("Wednesday");
                    break;
                case 4:System.out.println("Thursday");
                    break;
                case 5:System.out.println("Friday");
                    break;
                case 6:System.out.println("Saturday");
                    break;
                case 7:System.out.println("Sunday");
                    break;
                case 0:System.exit(0);
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }

    }
}
