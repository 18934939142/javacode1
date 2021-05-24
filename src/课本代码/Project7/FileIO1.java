package 课本代码.Project7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileout=new FileOutputStream("c.txt");
        for (int i=0;i<99;i++){
            fileout.write(i);

        }
        fileout.close();
        //
        FileInputStream filein=new FileInputStream("c.txt");
        int values=0;
        while ((values=filein.read())!=-1){
            System.out.print(values+" ");
        }
        filein.close();


    }
}
