package 课本代码.Project7.AccountManager;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;

public class Account {
    private long id;
    //private String name;
    private double amount;
    private Date date;

    public Account() {
    }

    public Account(long id, double amount, Date date) {
        this.id = id;
       // this.name = name;
        this.amount = amount;
        this.date = date;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        DateFormat ssd=DateFormat.getDateInstance();

        return "Account{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    /**
     * 写信息方法
     * @param out
     * @throws IOException
     */
    public void write(DataOutputStream out) throws IOException {
        out.writeLong(this.getId());
        out.writeDouble(this.getAmount());
        out.writeLong(this.getDate().getTime());
       // out.writeChars(this.getName());


    }

    /**
     * 读取信息方法
     * @param in
     * @return
     * @throws IOException
     */
    public Account read(DataInputStream in)throws IOException{
        this.setId(in.readLong());
        this.setDate(new Date(in.readLong()));
        //this.setName(String.valueOf(in.readChar()));
        this.setAmount(in.readDouble());

        return this;
    }

    /**
     * 用户信息读取方法，返回对象数组
     * @param file
     * @return
     * @throws IOException
     */
    public  static Account[] readAccount(File file) throws IOException{
        FileInputStream in =null;
        DataInputStream dataIn=null;
        Account[] accounts=new Account[2];

        try {
            in=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
        dataIn=new DataInputStream(in);
        try {
            for (int i = 0; i <accounts.length && dataIn.available()>0; i++) {
                Account temp=new Account();
                accounts[i]=temp.read(dataIn);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataIn.close();
        in.close();


        return accounts;
    }

    public static boolean writeAccount(Account[] accounts,File file)
            throws IOException{
        boolean flag=true;
        FileOutputStream out=null;
        DataOutputStream dataOut=null;

        try {
            out=new FileOutputStream(file);
            dataOut=new DataOutputStream(out);

            for (int i = 0; i <accounts.length; i++) {
                //将信息写入
                accounts[i].write(dataOut);
            }
        } catch (IOException e) {
            System.out.println("写入失败！");
            flag=false;
        }finally {
            if (dataOut!=null){
                dataOut.close();
            }
        }


        return flag;

    }
}
