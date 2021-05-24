package 课本代码.p158;

import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        System.out.println("输入字符:");
        int b;
       while (true){
           try {
               if ((char)(b=System.in.read())!='p') {
                   System.out.println((char) b);
               }else {
                   break;
               }
           } catch (IOException e) {
               e.printStackTrace();
           }

       }
    }
}
