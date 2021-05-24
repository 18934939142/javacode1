package 课本代码.p158.AfterClassHomework.p2;

/**
 * 电量管理类
 * 200度以下每度0.1
 *  * 200-500 每度0。3
 *  * >500   0.60
 * @author mojiangze
 */
public class ElectricityManager {
    public double testElec(Electricity e){
        double money=0.0;
        if (e.elec<=200){
            money=0.1*e.elec;
        }
        else if (e.elec>=200&&e.elec<500){
            money=0.3*e.elec;
        }
       else if (e.elec>500){
            money=0.6*e.elec;
        }
        return money;
    }
}
