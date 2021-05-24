package 多线程习题.out.production.untitled.p209.src.duoxiancheng;

/**
 * @author mojiangze
 */
public  class test implements Runnable{
    static Thread Mr20,Mr10,Mr5;
    static TicketSeller gzry;

    @Override
    public void run() {
        if (Thread.currentThread()==Mr5){
            gzry.sellRegulate(5);
        }else if (Thread.currentThread()==Mr10){
            gzry.sellRegulate(10);
        }else if (Thread.currentThread()==Mr20){
            gzry.sellRegulate(20);
        }
    }

    public static void main(String[] args) {
        test t=new test();
        Mr5=new Thread((Runnable) t);
        Mr10=new Thread((Runnable) t);
        Mr20=new Thread((Runnable) t);
        gzry=new TicketSeller();

        Mr20.start();
        Mr10.start();
        Mr5.start();
    }
}
