package 课堂作业.p121;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("小明","北京","123456","789@163.com");
        Employee e=new Employee("五楼",123.321,"2021-2-1");

        p.showMessage();
        e.showMessage();
    }
}
