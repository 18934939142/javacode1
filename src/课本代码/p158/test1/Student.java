package 课本代码.p158.test1;

public class Student extends Person{
    String classname;
    String xuehao;

    public Student() {
    }

    public Student(String classname, String xuehao) {
        this.classname = classname;
        this.xuehao = xuehao;
    }

    public Student(String name, int age, String sex, String classname, String xuehao) {
        super(name, age, sex);
        this.classname = classname;
        this.xuehao = xuehao;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", classname='" + classname + '\'' +
                ", xuehao='" + xuehao + '\'' +
                '}';
    }

    @Override
    public void prin(){
        System.out.println("学生类");
        System.out.println(this.toString());

    }
    public void a(){
        System.out.println("学生");
    }
}
