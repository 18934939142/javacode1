package 课本代码.project10.clien_server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器类
 * @author mojiangze
 */
public class Server {

    public static void main(String[] args) {
        ServerSocket server=null;
        String serverInfo=null;
        Socket yourSocket;
        DataInputStream in=null;
        DataOutputStream out=null;

        try {
            server=new ServerSocket(4212);
            yourSocket=server.accept();
            in=new DataInputStream(yourSocket.getInputStream());
            out=new DataOutputStream(yourSocket.getOutputStream());

            for (int i = 0; i <5; i++) {
                //读取客户端数据
                serverInfo=in.readUTF();
                //向客户端写入数据
                out.writeUTF("你好，我是服务器，你的请求是:"+serverInfo);
                System.out.println("服务器消息:"+serverInfo);
                Thread.sleep(800);

            }
            in.close();
            out.close();
            yourSocket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
