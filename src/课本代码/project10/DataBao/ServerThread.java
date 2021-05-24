package 课本代码.project10.DataBao;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerThread extends Thread{
    DatagramSocket socket=null;
    BufferedReader in=null;
    boolean moreQoutes=true;
    int number=0;
    int duankou=2556;
    public ServerThread() throws IOException {
        this("ServerThread");
    }

    public ServerThread(String namne) throws IOException {
        super(namne);
        //创建对象监听2556端口
        socket=new DatagramSocket(duankou);
        System.out.println("进入"+duankou+"端口");
    }

    @Override
    public void run() {
        System.out.println("开始执行线程>>>>");
        while (moreQoutes){
            try {
                byte[] buf=new byte[256];
                //接收数据 存入buf 长度length
                DatagramPacket packet=new DatagramPacket(buf, buf.length);//1.用于接收
                socket.receive(packet);
                //
                String quote=null;
                number++;
                if (number==5){
                    moreQoutes=false;
                }
                quote="Hi! 你是第"+number+"个访问者。,,,,";
                //字符串转化为byte数组
                buf=quote.getBytes();
                //获取客户端到IP地址
                InetAddress address=packet.getAddress();
                //获取客户端端口号
                int port=packet.getPort();
                //2.用于发送
                packet=new DatagramPacket(buf, buf.length,address,port);
                System.out.println("buf:"+buf.length);
                socket.send(packet);


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("发生错误");
                moreQoutes=false;
                System.exit(0);
            }
        }
        socket.close();
    }
}
