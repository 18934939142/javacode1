package 课堂作业;

public class test9 {

    static class Number{
        int x,y;

        public Number(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int Add(){
            return this.x+this.y;
        }
        public int Sunm(){
            return this.x-this.y;
        }
        public double Div(){
            return 1.0*this.x*this.y;
        }
        public double Chu(){
            return 1.0*this.x/this.y;
        }
    }
    public static void main(String[] args) {
        Number n= new Number(2,7);
        System.out.println("n1="+n.x+",n2="+n.y);
        System.out.println("加:"+n.Add());
        System.out.println("减:"+n.Sunm());
        System.out.println("乘:"+n.Div());
        System.out.println("除:"+n.Chu());
    }
}
