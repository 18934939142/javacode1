package 课本代码.Project7;

import java.io.*;

public class FileRreader {


    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader buffer_in=new BufferedReader(inputStreamReader);

        String s1="",s2="";
        do {

            System.out.println("请输入：");
            s1=buffer_in.readLine();
            if (s1==null){
                break;
            }
            if (s1.length()!=0){
                s1=s1+"\r"+"\n";
                s2=s2+s1;

            }
            writeFile(s2);
            readFile();
            s2="";
        }while (s1.length()!=0);

    }

    private static void readFile() throws IOException{
        FileReader f=new FileReader("d.txt");
        char[] data=new char[1024];
        int num=f.read(data);
        String str=new String(data,0,num);
        System.out.println(str);
        f.close();

    }

    private static void writeFile(String s2) throws IOException{
        FileWriter fw=new FileWriter("d.txt",true);
        fw.write(s2);
        fw.close();

    }
}
