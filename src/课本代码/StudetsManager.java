package 课本代码;
//定义一个抽象类
abstract class Student{
    public  String id;
    public  String name;
    public  String classname;
//    抽象方法
    public abstract void logIn();
    public abstract void clearOut();
}
//本科生类
class UnderGraduate extends Student{

    private String counsellor;//辅导员变量

    @Override
    public void logIn() {
        System.out.println("本科生注册成功！");
    }

    @Override
    public void clearOut() {
        System.out.println("本科生注销.........");
    }
}
class Gradute extends Student{

    private String instrutor;//导师变量
    private String research;//研究方向

    @Override
    public void logIn() {
        System.out.println("研究生注册成功!");
    }

    @Override
    public void clearOut() {
        System.out.println("研究生注销.................");
    }
}
public class StudetsManager {

    //学生注册方法
    public void add(Student s){
        s.logIn();
    }
    //学生注销方法
    public void delete(Student s){
        s.clearOut();
    }

    public static void main(String[] args) {
        StudetsManager manager=new StudetsManager();
        Student benkesheng=new UnderGraduate();//父类Student对象指向子类的对象
        Student yanjiusheng=new Gradute();

        manager.add(benkesheng);
        manager.add(yanjiusheng);
        manager.delete(benkesheng);
        manager.delete(yanjiusheng);

    }
}
