package 课堂作业;

public class test4 {
    //晴天可卖20朵 雨天12朵  连续几天一共卖出了112  平均每天卖出14   几个晴天几个雨天
    public static void main(String[] args) {
        int sum=112;
        int qt=20;
        int yt=12;
        int avg=14;
        int day=(sum/avg);
        System.out.println("一共卖了"+sum+"朵花");
        System.out.println("一个卖了"+(sum/avg)+"天");
        for(int i=1;i<(sum/avg);i++)
        {
            if((i*qt+(day-i)*yt)==sum)
            {
                System.out.println("用了"+i+"个晴天,"+(8-i)+"个雨天");
                System.out.println(i+"*20+"+(8-i)+"*12="+(i*20+(8-i)*12));
                break;
            }
        }
        System.out.println();

    }
}
