package 课本代码.p158.AfterClassHomework.p2;

import java.util.Scanner;

public class Maintest {
    public static void main(String[] args) {
        Electricity e=new Electricity();
        ElectricityManager manager=new ElectricityManager();
        System.out.println("输入本月电量：");

        double dl= 0;
        try {
            Scanner in = new Scanner(System.in);
            dl = in.nextDouble();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        e.setElec(dl);

        System.out.println(manager.testElec(e));
    }
}
