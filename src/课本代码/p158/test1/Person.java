package 课本代码.p158.test1;

public class Person {
    String name;
    int age;
    String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + sex + '\'' +
                '}';
    }

    public void prin(){
        System.out.println("人类");
        System.out.println(this.toString());

    }
    public void b(){
        System.out.println("人类");
    }
}
