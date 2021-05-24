package 课本代码.Project7;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SystemIO {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("idea_code.iml");
        BufferedInputStream bufin= new BufferedInputStream(in);
        BufferedInputStream keyin=new BufferedInputStream(System.in);

        byte[] nums1=new byte[1024];
        byte[] nums2=new byte[1024];
        //文件中读入数据放入字节数组内
        int count1=bufin.read(nums1);
        //将字节数组转换成字符串
        String str1=new String(nums1,0,count1);
        System.out.println(str1);
        bufin.close();
        //
        System.out.println("输入：");
        int count2=keyin.read(nums2);

        String str2=new String(nums2,0,count2);
        System.out.println(str2);
    }
}
