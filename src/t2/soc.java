package t2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class soc {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket(InetAddress.getByName("localhost"),3306);
            PrintWriter out=new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())));
            out.println("hello");
            BufferedReader in=new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));
            String line=in.readLine();
            System.out.println(line);
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
