package 课本代码.Project7;

import java.io.File;
import java.io.IOException;

public class FileBianli {

    public static void test(File file){
        if (file.isFile()){
            System.out.println(file.getAbsolutePath()+"是文件");
        }else if (file.isDirectory()){
            System.out.println(file.getAbsolutePath()+"是文件夹");
        }
        File[] listFile=file.listFiles();
        if (listFile!=null && listFile.length>0){
            for (File fs:listFile
                 ) {
            test(fs);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File f=new File("/Users/mojiangze/IdeaProjects/idea_code/src/课本代码");
        test(f);
        //
        File fs=new File("/Users/mojiangze/IdeaProjects/idea_code/src/课本代码/day20214");
        if (!fs.exists()){
            fs.mkdir();
        }
        File newf=new File("/Users/mojiangze/IdeaProjects/idea_code/src/课本代码/day20214/aa.txt");
        if (!newf.exists()){
            newf.createNewFile();
        }
        if (newf.exists()){
            System.out.println("aa.txt---存在");
        }else {
            System.out.println("aa.txt---不存在");
        }
        System.out.println("文件路径："+fs.getAbsolutePath());
       if (newf.exists()){
           newf.delete();
       }
       if (newf.exists()){
           System.out.println("aa.txt---存在");
       }else {
           System.out.println("aa.txt---不存在");
       }


    }
}
