package TestMain;

import java.util.ArrayList;
import java.util.List;

public class PrintX {
    public static List<String> printX(int n) {
        List<String> ret = new ArrayList<>();
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == start || j == end) {
                    stringBuilder.append("X");
                } else {
                    stringBuilder.append(" ");
                }
            }
            start++;
            end--;
            ret.add(stringBuilder.toString());
        }
        return  ret;
    }

    public static void main(String[] args) {
        System.out.println(printX(1));
        System.out.println(printX(2));
        System.out.println(printX(3));
        System.out.println(printX(4));
    }
}
