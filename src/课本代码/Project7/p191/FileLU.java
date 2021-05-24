package 课本代码.Project7.p191;

import java.io.*;
import java.util.Scanner;

/**
 * 输入小写字母转换成大写字母 保存到文件中
 * @author mojiangze
 */
public class FileLU {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("m.txt",true);
        BufferedOutputStream bf_out=new BufferedOutputStream(out);
        Scanner in=new Scanner(System.in);
        String str=null,str2=null;
        System.out.println("输入小写字母：");
        str=in.nextLine();
        str2=str.toUpperCase();

        //开始写入文件中
        //字符串转化为字节数组
        bf_out.write(str2.getBytes());
        bf_out.write("\n".getBytes());
        bf_out.flush();
        bf_out.close();
        //读取数据
        FileInputStream inputStream=new FileInputStream("m.txt");
        BufferedInputStream bf_in=new BufferedInputStream(inputStream);
        byte[] b=new byte[1024];
        int num=bf_in.read(b);
        String str3=new String(b,0,num);
        System.out.println("读取数据：");
        System.out.println(str3);
        bf_in.close();
    }
}
