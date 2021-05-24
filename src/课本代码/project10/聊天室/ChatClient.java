package 课本代码.project10.聊天室;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author mojiangze
 *客户端类 
 */
public class ChatClient extends Frame implements ActionListener {
    Label lb=new Label("聊天");
    Panel panel=new Panel();
    TextField txtShuru=new TextField(10);
    TextArea txtArea=new TextArea();
    Socket client=null;
    InputStream in=null;
    OutputStream out=null;
    //构造


    public ChatClient() throws HeadlessException, IOException {
        super("客户机");
        this.setSize(250,250);
        panel.add(lb);
        panel.add(txtShuru);
        txtShuru.addActionListener(this);
        this.add("North",panel);
        this.add("Center",txtArea);
        //
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

        client=new Socket(InetAddress.getLocalHost(),5509);
        //在文本区显示服务器机名
        txtArea.append("已连接服务器:"+client.getInetAddress().getHostName()+"\n\n");
        in=client.getInputStream();
        out=client.getOutputStream();

        while (true){
            byte[] buf=new byte[256];
            in.read(buf);
            String str=new String(buf);
            txtArea.append("来自服务器的消息: "+str);
            txtArea.append("\n");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //      获取输入框的内容
            String str=txtShuru.getText();
            //将字符串转换为字节数组
            byte[] buf=str.getBytes();
            //把输入框设置为空
            txtShuru.setText(null);
            //向服务器写入信息
            out.write(buf);
            txtArea.append("我发送的消息:"+str);
            txtArea.append("\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        new ChatClient();
    }
}
