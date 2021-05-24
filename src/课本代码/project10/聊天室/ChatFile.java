package 课本代码.project10.聊天室;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ChatFile extends Frame implements ActionListener {
    Label lb = new Label("文件查找");
    Panel panel = new Panel();
    TextField txtShuru = new TextField(10);
    TextArea txtArea = new TextArea();
    Socket client = null;
    InputStream in = null;
    OutputStream out = null;
    FileReader fileReader=null;
    File file;

    public ChatFile() throws HeadlessException, IOException {
        super("文件查找");
        this.setSize(250, 250);
        panel.add(lb);
        panel.add(txtShuru);
        txtShuru.addActionListener(this);
        this.add("North", panel);
        this.add("Center", txtArea);
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

        try {
            while (true){
                byte[] buf=new byte[5];

                in.read(buf);
                String str=new String(buf);
                txtArea.append("需要查找的文件名: "+str);
                txtArea.append("\n");
                System.out.println("str:"+str);
                fileReader=new FileReader(str);
                System.out.println(str);
                if (fileReader==null){
                    txtShuru.setText("txt文件不存在！");
                }else {
                    char[] data=new char[1024];
                    int num=fileReader.read(data);
                    String strfile=new String(data,0,num);
                    txtShuru.setText(strfile);
                    fileReader.close();
                }
            }
        } catch (FileNotFoundException e){
            txtShuru.setText("异常:文件不存在！");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String str=txtShuru.getText();
            byte[] buf=str.getBytes();
            txtShuru.setText(null);
            out.write(buf);
            txtArea.append("文件内容:"+str);
            txtArea.append("\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        new ChatFile();
    }
}
