package 课本代码.p158.AfterClassHomework.p1;

public class TestDK {
    public static void main(String[] args) {
        DaiKuan dk = new DaiKuan(123,32,2);

        dk.Innumbers(dk.nums,dk.lilv,dk.year);
        System.out.println(dk.toString());
    }
}
