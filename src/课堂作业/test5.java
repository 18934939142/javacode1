package 课堂作业;

public class test5 {

    public static void main(String[] args) {
        double money=400;
        double zheng=0.05;
        int year=1;
        while(year<10)
        {
            money=money*zheng+money;
            if(year==4) {
                System.out.println(year + "年后的学费为:" + money);
            }
            year++;
        }
        System.out.println(year+"年后的学费为:"+money);

    }
}
