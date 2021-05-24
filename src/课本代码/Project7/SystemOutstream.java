package 课本代码.Project7;

import java.io.*;

/**
 * @author mojiangze
 */
public class SystemOutstream {
    public static void main(String[] args) throws IOException {
        String str11="a.txt";
        FileOutputStream out=new FileOutputStream("\""+str11+"\"");
        BufferedOutputStream bfout=new BufferedOutputStream(out);
        //要写入的内容
        String str="天上掉下一个猪八戒2222\n";

        //getBytes->将字符串转换为Byte数组
        bfout.write(str.getBytes());
        bfout.write(str.getBytes());
        bfout.write(str.getBytes());
        bfout.flush();//清空缓冲区
        bfout.close();

        FileInputStream in = new FileInputStream("a.txt");
        BufferedInputStream bfin=new BufferedInputStream(in);

        byte[] byarr=new byte[1024];
        int num=bfin.read(byarr);
        String str2=new String(byarr,0,num);
        System.out.println(str2);
        bfin.close();
    }
}
