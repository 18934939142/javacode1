package 课堂作业.p140;

public class p140_3 {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int t=0;
        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j]=t;
                t++;
            }
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
