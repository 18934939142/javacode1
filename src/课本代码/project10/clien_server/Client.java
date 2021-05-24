package 课本代码.project10.clien_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 客户端类
 * @author mojiangze
 */
public class Client {
    public static void main(String[] args) {
        String clientInfo=null;
        Socket mySocket;
        DataInputStream in=null;
        DataOutputStream out=null;

        try {
            mySocket=new Socket("localhost",4212);
            in=new DataInputStream(mySocket.getInputStream());
            out=new DataOutputStream(mySocket.getOutputStream());
            //向服务器输出
            out.writeUTF("你好！");
            for (int i = 0; i <5 ; i++) {
                //读取服务器数据
                clientInfo=in.readUTF();
                //向服务器写入岁数
                out.writeUTF(":"+Math.random());
                System.out.println("客户端消息："+clientInfo);
                Thread.sleep(800);
            }
            out.close();
            in.close();
            mySocket.close();
        } catch (IOException e) {
            System.out.println("链接失败");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
