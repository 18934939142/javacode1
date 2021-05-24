package 多线程习题.out.production.untitled.p209.src.p209;


class xian1 extends Thread implements isPrime{

    //2-1000的质数
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    //
    @Override
    public void run() {
            int count=0;
            for (int j = 2; j <= 1000; j++) {
                if (isPrime(j)){
                    System.out.print("线程1:"+j+" ");
                    count++;
                    if (count%5==0) {
                        System.out.println();
                    }
                }
            }
        }

}
class xian2 extends Thread implements isPrime{
    //2-1000的质数
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    //
    @Override
    public void run() {
        int count=0;
        for (int j = 1000; j <= 2000; j++) {
            if (isPrime(j)){
                System.out.print("线程2:"+j+" ");
                count++;
                if (count%5==0){
                    System.out.println();
                }
            }
        }
    }
}
public class dxc {
    public static void main(String[] args) {
        xian1 x1=new xian1();
        xian2 x2=new xian2();
        x1.start();
        x2.start();


    }



}
