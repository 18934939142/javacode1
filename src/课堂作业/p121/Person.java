package 课堂作业.p121;


/**
 * p121第一题
 * @author 不用减肥的大熊猫
 */
public class Person {
    String Name;
    String Adree;
    String Phone;
    String Emali;

    public Person() {
    }

    public Person(String name, String adree, String phone, String emali) {
        Name = name;
        Adree = adree;
        Phone = phone;
        Emali = emali;
    }

    void showMessage(){
        System.out.println("姓名:"+Name+" 地址:"+Adree+" 电话:"+Phone+" 邮箱:"+Emali);
    }

}
