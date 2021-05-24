package 课本代码.project10.DataBao;

import java.io.IOException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("准备启动服务端.......");
        new ServerThread().start();

    }
}
