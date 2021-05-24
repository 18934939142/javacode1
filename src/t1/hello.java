package t1;

import java.util.Scanner;

public class hello {
    public static class Box{
        private int width;
        private int heigth;
        private int length;
        //构造方法  初始化成员变量
        public Box(){
            this.width=10;
            this.heigth=12;
            this.length=9;
        }
       void showBox(){
            System.out.println(width);
           System.out.println(heigth);
           System.out.println(length);
        }
    }
    public static void main(String[] ages){
        Scanner in=new Scanner(System.in);
        Box b=new Box();
        Box box=new Box();
        b.showBox();
        box.length=100;
        box.showBox();
    }
}
