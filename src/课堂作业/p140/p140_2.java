package 课堂作业.p140;

/**
 * 将一维数组倒置
 */
public class p140_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int[] newArr=new int[arr.length];
        int low=0;//头指针
        int high=arr.length-1;//尾指针
        for (int s:arr
        ) {
            System.out.print(" "+s);
        }
        System.out.println();
        while (low<high){
            int tmp=arr[low];
            arr[low]=arr[high];
            arr[high]=tmp;
            low++;
            high--;
        }
        for (int s:arr
             ) {
            System.out.print(" "+s);
        }
    }
}
