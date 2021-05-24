package 课堂作业.p140;  

public class p140_4 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hello");
        s.append(" java");
        System.out.println(s);

        s.insert(5,"my");
        System.out.println(s);

        System.out.println("返回当前容量 理论值:"+s.capacity());

        System.out.println("长度："+s.length());

        s.delete(1,3);
        System.out.println(s);
        s.deleteCharAt(0);
        System.out.println(s);

        System.out.println(s.substring(6));

        System.out.println(s.substring(1,3));
    }
}
