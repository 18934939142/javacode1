package 课堂作业.p134;

import java.util.Scanner;

/**
 * @author 不用减肥的大熊猫
 */
public class HuiwenChuan {

    public static void main(String[] args) {
        String charser=null;

        System.out.println("输入检测字符串:");
        Scanner in = new Scanner(System.in);
        charser=in.nextLine();
        if (isPaidrome(charser)){
            System.out.println("是回文串");
        }else {
            System.out.println("不是回文串");
        }
    }

    /**
     *
     * @param charser
     * @return boolean
     */
    private static boolean isPaidrome(String charser) {
        int low=0;
        int high=charser.length()-1;

        while (low<high){
            if (charser.charAt(low)!=charser.charAt(high)){
                return  false;
            }
            low++;
            high--;
        }
        return true;
    }
}
