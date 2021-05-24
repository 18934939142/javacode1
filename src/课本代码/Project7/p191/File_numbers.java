package 课本代码.Project7.p191;

import com.sun.tools.internal.xjc.outline.FieldOutline;


import java.io.*;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Random;

/**
 * 100个随机整数写入文件
 * @author mojiangze
 */
public class File_numbers {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("numbers.txt",true);
//        BufferedOutputStream bfOut=new BufferedOutputStream(out);
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            out.write(random.nextInt(10)*i);
            out.write(" ".getBytes());
        }
        out.write("\n".getBytes());
        out.close();

        FileInputStream inputStream=new FileInputStream("numbers.txt");

        int values;
       while ((values=inputStream.read())!=-1){
           System.out.print(values+" ");
       }
        inputStream.close();
    }


}
