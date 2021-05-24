package 课本代码.Project7;

import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double number=0.0;
        while (in.hasNextDouble()){
            number=in.nextDouble();
            System.out.println(number);
        }
    }
}
