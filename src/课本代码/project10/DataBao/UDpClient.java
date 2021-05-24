package 课本代码.project10.DataBao;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDpClient {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket socket=new DatagramSocket();
        byte[] buf=new byte[256];
        InetAddress address=InetAddress.getByName("localhost");
        //创建DategramPacket对象
        DatagramPacket packet=new DatagramPacket(buf, buf.length,address,2556);
        //客户端发送数据
        socket.send(packet);
        //转换为接收数据
        packet=new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        //将数据转换为字符串
        String str=new String(packet.getData());
        System.out.println("客户端接收到到数据:"+str);
        System.out.println("str:"+str.length());
        socket.close();
    }
}
