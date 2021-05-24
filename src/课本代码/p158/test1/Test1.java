package 课本代码.p158.test1;

public class Test1 {
    public static void main(String[] args) {
        Person person=new Person("人类",12,"男");
        Student student=new Student("学生类",12,"男","软件2班","123");
        Person p2=student;
        person.prin();
        student.prin();
        p2.prin();
        person.b();
        student.a();
        p2.b();


    }
}
