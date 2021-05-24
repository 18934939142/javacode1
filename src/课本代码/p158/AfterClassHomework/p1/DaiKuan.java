package 课本代码.p158.AfterClassHomework.p1;

/**
 * 贷款类
 * @author mojiangze
 */
public class DaiKuan {
    double nums;//总额
    double lilv;//利率
    int year;//年份

    public DaiKuan() {
    }

    public DaiKuan(double nums, double lilv, int year) {
        this.nums = nums;
        this.lilv = lilv;
        this.year = year;
    }

    public double getNums() {
        return nums;
    }

    public void setNums(double nums) {
        this.nums = nums;
    }

    public double getLilv() {
        return lilv;
    }

    public void setLilv(double lilv) {
        this.lilv = lilv;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DaiKuan{" +
                "nums=" + nums +
                ", lilv=" + lilv +
                ", year=" + year +
                '}';
    }

    //
    public void Innumbers(double nums,double lilv,int year)
            throws IllegalArgumentException{
        if (nums<0 || year<0 || lilv<0){
            throw new IllegalArgumentException("总额，年数，利率有小于0的数");
        }
    }
}
