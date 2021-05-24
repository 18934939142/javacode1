package 课本代码.p158.AfterClassHomework.p2;

/**
 * 电量类--
 * 200度以下每度0.1
 * 200-500 每度0。3
 * >500   0.60
 * 注意各种异常！！！！
 * @author mojiangze
 */
public class Electricity {
    double elec;//电量

    public Electricity() {
    }

    public Electricity(double elec) {
        this.elec = elec;
    }

    public double getElec() {
        return elec;
    }

    public void setElec(double elec) {
        this.elec = elec;
    }

    @Override
    public String toString() {
        return "Electricity{" +
                "本月电量🔋=" + elec +
                '}';
    }
}
