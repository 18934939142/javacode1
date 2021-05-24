package t2;

import java.io.*;

public class IO {

    public static void main(String[] args) {
        System.out.println("请输入:");

        try {
            PrintWriter out = new PrintWriter(
              new BufferedWriter(
                      new OutputStreamWriter(
                      new FileOutputStream("b.txt"))));
            int i=0xabc;
            out.println("哈哈哈哈哈哈哈哈哈哈");
            out.println("dsadasdaasd");
            out.close();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/t2/TEY.java")));
            String line;
            while((line=in.readLine())!=null)
            {

                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
