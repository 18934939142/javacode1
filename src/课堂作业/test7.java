package 课堂作业;

/**
 * 编写一段Java程序，查找1～100之间的素数并将运行结果输出。
 * （素数：除了1和它本身，没有别的除数。）
 */
public class test7 {
    public static void main(String[] args) {
        int num=2;
        int count=0;
        while (num<=100){
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
            if (count%5==0){
                System.out.println();
            }
            System.out.print(" "+num);
            count++;
        }
        num++;
    }
    }
}

