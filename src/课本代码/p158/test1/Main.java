package 课本代码.p158.test1;

public class Main {
    String name;
    int age;

    public Main() {
    }

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Main m= new Main("小明",18);

        System.out.println(m.toString());
        System.out.println(m.getName());
    }
}
