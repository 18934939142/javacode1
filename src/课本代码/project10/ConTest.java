package 课本代码.project10;

import javax.print.DocFlavor;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConTest {
    public static void main(String[] args) {
        try {
            URL go=new URL("https://www.sina.com/");
            DataInputStream inputStream=new DataInputStream(go.openStream());
            String Line=null;
            while ((Line=inputStream.readLine())!=null){
                System.out.println(Line);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }//
        System.out.println("比阿杜----------");
        URL baidu;

        {
            try {
                baidu = new URL("http://www.baidu.com/");
                URLConnection biaduCon=baidu.openConnection();
                DataInputStream biaduLine=new DataInputStream(biaduCon.getInputStream());
                String baiduStr;
                while ((baiduStr=biaduLine.readLine())!=null){
                    System.out.println(baiduStr);
                }
                biaduLine.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
