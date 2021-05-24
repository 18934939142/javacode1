package 课堂作业;

public class test8 {
    public static void main(String[] args) {
        int count=8;
        for (int i=1;i<=5;){
            int j=1;
            //
            for (int x=1;x<=count;x++){
                System.out.print(" ");
            }
           count-=2;
            //
            while (j<=i){
                System.out.print("$ ");
                j++;
            }
            i+=2;
            System.out.println();
        }
        //
        count=6;
        for (int i=3;i>=1;i-=2){
            //
            for (int x=1;x<=count;x++){
                System.out.print(" ");
            }
            count+=2;
            //
            int j=1;
            while (j<=i){
                System.out.print("$ ");
                j++;
            }

            System.out.println();
        }
    }
}
