package 课本代码.com.project8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mojiangze
 */
public class myTexteDitor extends JFrame implements ActionListener {
    //声明菜单条
    MenuBar mainmenubar=new MenuBar();
    //声明主菜单
    Menu file;
    //声明各个子菜单
    MenuItem openfile;
    MenuItem newfile;
    MenuItem closefile;
    MenuItem savefile;
    MenuItem exitfile;
    TextArea text;

    public myTexteDitor(String title){
        super(title);
        CloseHandler1 closeHandler= new CloseHandler1();
        this.addWindowListener(closeHandler);
        setSize(400,400);
        setLocationRelativeTo(null);
        menuinit();//初始化菜单
        text=new TextArea();

        this.add(text);
        setVisible(true);
    }

    /**
     * 初始化菜单方法
     */
    private void menuinit() {
        mainmenubar = new MenuBar();
        file=new Menu("菜单");
        newfile=new MenuItem("新建文件");
        openfile=new MenuItem("打开文件");
        closefile=new MenuItem("关闭文件");
        savefile=new MenuItem("保存文件");
        exitfile=new MenuItem("退     出");
        //
        file.add(newfile);
        file.add(openfile);
        file.add(closefile);
        file.add(savefile);
        file.add(exitfile);
        //
        mainmenubar.add(file);
        //为窗体设置主菜单
        setMenuBar(mainmenubar);

        newfile.addActionListener(this);
        openfile.addActionListener(this);
        closefile.addActionListener(this);
        savefile.addActionListener(this);
        exitfile.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //获取事件对象
        Object ob=e.getSource();
        //创建文件选择器对象
        JFileChooser f=new JFileChooser();

        if ((ob==newfile)||(ob==closefile)){
            //如果是新建或关闭文件，则把内容清空
            text.setText("");
        }else if (ob==openfile){
            //弹出具有自定义approve按钮的自定义文件选择器对话框
            f.showOpenDialog(this);

            try {
                //字符缓冲器
                StringBuffer s=new StringBuffer();
                //构造一个filereadder对象，其参数为在文件选择器中选择的文件
                FileReader in=new FileReader(f.getSelectedFile());
                while (true){
                    int b=in.read();//读文件
                    if (b==-1){//如果读到了结尾则退出
                        break;
                    }
                    s.append((char) b);//否则一直添加到s中
                }
                //把字符缓冲区到内容转换成字符形式 添加进文本框
                text.setText(s.toString());
                in.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }else if (ob==savefile){
            //显示文件选择对话框
            f.showSaveDialog(this);

            try {
                FileWriter out=new FileWriter(f.getSelectedFile());
                //获取text里面到内容 然后写入
                out.write(text.getText());
                out.close();

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }else if (ob==exitfile){
            System.exit(0);
        }

    }




    public static void main(String[] args) {
        new myTexteDitor("文件编辑器");
    }
}
 class CloseHandler1 extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

}