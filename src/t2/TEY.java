package t2;

import java.io.IOException;

/**
 * @author 不用减肥的大熊猫
 */
public class TEY {


    public static void main(String[] args) {
        System.out.println("请输入:");

        byte[] barr = new byte[1024];
        try {
            int len=System.in.read(barr);
            String s = new String(barr,0,len);
            System.out.println("读到了:"+len+"个字节");
            System.out.println("s:"+s);
            System.out.println("s的长度:"+s.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
