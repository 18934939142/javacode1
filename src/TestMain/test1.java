package TestMain;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public  static int[] rotate(int[] nums, int k) {
        int len= nums.length;
//        for (int i = 0; i <k; i++) {
//            int wei=nums[nums.length-1];
//            for (int j = 0; j < nums.length; j++) {
//                int tmp=nums[j];
//                nums[j]=wei;
//                wei=tmp;
//            }
//        }
//        for (int i = 0; i <k ; i++) {
//            int tmp=nums[len-1];
//            for (int j = len-1; j >0 ; j--) {
//                nums[j]=nums[j-1];
//            }
//            nums[0]=tmp;
//        }
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }


    public static void main(String[] args) {
            int [] arr={1,2,3,4,5,6,7};
        for (int n:rotate(arr,3)
             ) {
            System.out.print(n+" ");
        }

    }
}
