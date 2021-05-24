package 课堂作业.p140;

/**
 * 找出一维数组的最大值最小值及其差
 */
public class p140_1 {
    public static void main(String[] args) {
        int[] arr={1,2,5,34,57,7,8,12,43,23,0,-12};
        int max=0,min=0;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int cha=max-min;
        System.out.println("最大值："+max+",最小值："+min+",差值："+cha);
    }
}
