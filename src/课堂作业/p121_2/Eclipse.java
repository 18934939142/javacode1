package 课堂作业.p121_2;

public class Eclipse implements Area{
    double r,a,b;

    /**
     *
     * @param r
     * @param a
     * @param b
     */
    public Eclipse(double r, double a, double b) {
        this.r = r;
        this.a = a;
        this.b = b;
    }

    /**\
     *
     */
    @Override
    public void area() {
        System.out.println("椭圆形面积:"+(Math.PI*this.a*this.b));
    }
}
