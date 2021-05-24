package 课堂作业.p121_2;

public class Rectangle implements Area{
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void area() {
        System.out.println("长方形面积为："+(this.x*this.y));
    }
}
