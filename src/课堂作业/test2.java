package 课堂作业;

public class test2 {
    //显示前三十个素数
    public static void main(String[] args) {
        final int max=50;
        System.out.println("前"+max+"个素数：");
            int num=2,cont=0;

            while (cont<max) {
                boolean flag=true;

                for (int i = 2; i <= num/2; i++)
                {
                    if (num % i == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                {
                    cont++;
                    if(cont%10==0)
                    {
                        System.out.println(" "+num);
                    }
                    else
                    {
                        System.out.print(" " + num);
                    }
                }
                num++;
            }
    }
}
