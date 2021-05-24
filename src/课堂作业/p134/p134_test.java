package 课堂作业.p134;

public class p134_test {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("12345");
        s1.append("ddd");
        s1.insert(1,"jjia");
        s1.append("aaa");
        System.out.println(s1+"len:"+s1.length());
    }
}
