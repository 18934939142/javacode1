package 课本代码;

import java.util.Random;

/**
 * @author 不用减肥的大熊猫
 */
public class Arr {
    public static void main(String[] args) {
        String str="a.txt";
        System.out.println("\""+str+"\"");
        int arr[]=new int[10];
        Random random=new Random();
//        random.nextInt(100);生成0-99之间的随机整数
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }

        System.out.print("未排序:>");
        for (int s:arr
             ) {
            System.out.print(" "+s);
        }

        System.out.print("\n排序后（升序）：");
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1])
                {
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }
        for (int s:arr
        ) {
            System.out.print(" "+s);
        }

    }
}
