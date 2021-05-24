package 课本代码.Project7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {
    public static void main(String[] args) throws IOException {
        File f=new File("d.txt");
        if (f.exists()){
            f.delete();
        }
        f.createNewFile();
        RandomAccessFile rf=new RandomAccessFile(f,"rw");
        rf.writeChars("一二三四五，上山大老虎");
        //记录当前指针位置
        long pf=rf.getFilePointer();
        System.out.println("当前指针位置:"+pf);
        //写入两种数据类型 int -- 4  char--2 double--8字节 float--4 byte--1字节
        //8位==1字节
        rf.writeDouble(123.23);
        rf.writeInt(110);
        for (int i = 0; i <pf; i+=2) {
            //移动指针到i到位置
            rf.seek(i);
            System.out.println(rf.readChar());
        }
        System.out.println(rf.readDouble());
        System.out.println(rf.readInt());


    }
}
