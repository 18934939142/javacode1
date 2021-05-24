package 课本代码.Project7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mojiangze
 */
public class SystemReaderIO {
    public static void main(String[] args) throws IOException {
        InputStreamReader red_in=new InputStreamReader(System.in);
        BufferedReader bf_red=new BufferedReader(red_in);
        System.out.print("输入一行字符串回车结束:>");
        System.out.println(bf_red.readLine());


        boolean flag=false;
        do {
            try {
                System.out.print("输入一个浮点数:>");
                double num= Double.parseDouble(bf_red.readLine());
                System.out.println(num);
                flag=false;
            } catch (NumberFormatException e) {
                System.out.println("输入数据错误！");
                flag=true;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }while (flag);


    }
}
