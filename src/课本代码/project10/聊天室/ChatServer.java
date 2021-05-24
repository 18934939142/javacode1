package 课本代码.project10.聊天室;

import com.sun.codemodel.internal.JWhileLoop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatServer extends Frame implements ActionListener {
    Label lb=new Label("聊天");
    Panel panel=new Panel();
    TextField txtShuru=new TextField(10);
    TextArea txtArea=new TextArea();
    Socket client;
    ServerSocket server;
    InputStream in=null;
    OutputStream out=null;

    public ChatServer() throws HeadlessException, IOException {
        super("服务器");
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

        server=new ServerSocket(5509);
        //监听server的端口
        client=server.accept();

        //在文本区显示客户端机名
        txtArea.append("已连接客户机:"+client.getInetAddress().getHostName()+"\n\n");
        in=client.getInputStream();
        out=client.getOutputStream();

        while (true){
            byte[] buf=new byte[256];
            in.read(buf);
            String str=new String(buf);
            txtArea.append("来自客户机的消息:"+str);
            txtArea.append("\n");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String str=txtShuru.getText();
            byte[] buf=str.getBytes();
            txtShuru.setText(null);
            out.write(buf);
            txtArea.append("我说:"+str);
            txtArea.append("\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        new ChatServer();
    }
}
