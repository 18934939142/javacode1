package 课本代码.project10;

import java.net.InetAddress;

public class interTest1 {

    public static void main(String[] args) throws Exception{
        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println("本机地址:"+inetAddress.getHostAddress());
        System.out.println("本机名称:"+inetAddress.getHostName());
        inetAddress=InetAddress.getByName("www.taobao.com");
        System.out.println("淘宝:"+inetAddress.getHostAddress());
        System.out.println("本机名称:"+inetAddress.getHostName());
        inetAddress=InetAddress.getByName("www.baidu.com");
        System.out.println("百度:"+inetAddress.getHostAddress());
        System.out.println("本机名称:"+inetAddress.getHostName());
    }
}
