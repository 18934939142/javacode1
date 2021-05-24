package 课堂作业.p121;

import java.util.Date;

public class Employee extends Person{
    String offce;
    double salary;
    String time;


    public Employee() {
    }

    public Employee(String offce, double salary, String time) {
        this.offce = offce;
        this.salary = salary;
        this.time = time;
    }

    public Employee(String name, String adree, String phone, String emali, String offce, double salary, String time) {
        super(name, adree, phone, emali);
        this.offce = offce;
        this.salary = salary;
        this.time = time;
    }

    @Override
    void showMessage(){
        System.out.println(" 办公室:"+offce+" 工资:"+salary+" 入职时间："+time);
    }
}
