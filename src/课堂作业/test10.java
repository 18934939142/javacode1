package 课堂作业;

import java.lang.annotation.Documented;

public class test10 {
    static class Car{
        double Speed;
        double Size;
        String Color;

        /**
         *
         * @param speed
         * @param size
         * @param color
         */
        public Car(double speed, double size, String color) {
            Speed = speed;
            Size = size;
            Color = color;
        }


        //
        void  ShowCar(){
            System.out.println("目前车辆:");
            System.out.println("颜色:"+this.Color);
            System.out.println("速度:"+this.Speed);
            System.out.println("体积:"+this.Size);
            System.out.println("------------------------");
        }
        void Move(int x){
            System.out.println("移动了"+x+"米");
        }
        void setSpeed(int speed){
            this.Speed=speed;
            System.out.println("设置速度成功！现在的速度为："+this.Speed+"公里每小时");
        }
        void Addspeed(){
            this.Speed+=20;
            System.out.println("提速20!"+"现在的速度为:"+this.Speed+"公里每小时");

        }
        void Downspeed(){
            this.Speed-=20;
            System.out.println("减速20!"+"现在的速度为:"+this.Speed+"公里每小时");
        }
    }

    public static void main(String[] args) {
        Car c1=new Car(30,45,"红色");
        c1.ShowCar();
        c1.Move(20);
        c1.setSpeed(90);
        c1.Addspeed();
        c1.Downspeed();

    }
}
