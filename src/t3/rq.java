package t3;

import java.util.ArrayList;

public class rq {


    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(10);
        ArrayList<String> brr = new ArrayList<String>(20);
//        arr.add("123");
        for (int i=0;i<20;i++)
        {
            arr.add("哇:"+i);
            brr.add("哇:"+i);
        }
        System.out.println(arr.contains("13"));
        System.out.println(arr.equals(brr));
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
