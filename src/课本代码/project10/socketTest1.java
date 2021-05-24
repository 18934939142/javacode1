package 课本代码.project10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class socketTest1 {
    public static void main(String[] args) {
        try {
            Socket conn=new Socket("stdtime.gov.hk",13);
            BufferedReader in = new BufferedReader(new InputStreamReader
                    (conn.getInputStream()));
            String dattime=in.readLine();
            System.out.println(dattime);
            conn.close();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("--------");
        }
    }
}
