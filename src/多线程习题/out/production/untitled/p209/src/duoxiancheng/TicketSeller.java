package 多线程习题.out.production.untitled.p209.src.duoxiancheng;

/**
 * @author mojiangze
 */
public class TicketSeller {
    int sunFive=3,m20=0,m10=0;
    public synchronized void sellRegulate(int money){
        if (money==5){
            System.out.println("-------------5------------");
            System.out.println("mr5--现在5元："+sunFive);
            System.out.println("你的金额为5");
            System.out.println("你的金额刚刚好->出票一张->找零:0");
            sunFive++;
            System.out.println("-------------5 end------------");
        }else if (money==10){
            System.out.println("-------------10------------");
            System.out.println("mr--10--现在5元："+sunFive);
            System.out.println("你的金额为10");
            while (sunFive<1){
                System.out.println("10---等待中..........");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            sunFive--;
            m10++;
            System.out.println("金额10---找零:5");
            System.out.println("-------------10 end------------");
        }else if (money==20){
            System.out.println("-------------20------------");
            System.out.println("mr20--现在5元："+sunFive);
            System.out.println("你的金额为20");
            while (sunFive<3){
                System.out.println("20---等待中..........");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            m20++;
            sunFive=sunFive-3;
            System.out.println("金额20--->找零:15");
            System.out.println("-------------20 end------------");
        }
        System.out.println("现在5元数量："+sunFive+",现在的10元数量:"+m10+",现在的20元数量:"+m20);
        notifyAll();
    }

}
