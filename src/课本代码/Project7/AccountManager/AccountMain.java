package 课本代码.Project7.AccountManager;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class AccountMain {
    public static void main(String[] args) throws IOException {
        DateFormat ssd = DateFormat.getDateInstance();
        File file=null;
        if (args.length>0){
            //以main函数到参数创建File对象
            file=new File(args[0]);
        }else {
            file=new File("account.txt");
        }
        //创建对象数组，ssd对象的paerse方法用于将字符串转换为Data对象
        Account[] accounts= new Account[2];
        try {
            accounts = new Account[]{new Account(1,2000.00,ssd.parse("2020-4-21")),
                                new Account(2,6000.00,ssd.parse("2020-4-21"))};
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("正在保存数据");
        //调用写入方法
        if (Account.writeAccount(accounts,file)){
            System.out.println("数据写入成功");
        }else {
            System.out.println("数据写入失败！");
        }
        //读数据
        accounts=Account.readAccount(file);
        System.out.println("正在读取数据......");
        if (accounts.length==0){
            System.out.println("无数据....");
        }else {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println(accounts[i]);
            }
        }
        System.out.println("数据显示完毕.");


    }
}
