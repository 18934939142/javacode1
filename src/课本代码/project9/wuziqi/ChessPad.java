package 课本代码.project9.wuziqi;

import java.awt.*;
import java.awt.event.*;

public class ChessPad extends Panel implements MouseListener, ActionListener {
    int x=-1,y=-1,chessmancolor=1;
    static int[][] chessArr=new int[21][21];
    Button btn=new Button("重新开局");
    TextField txt1=new TextField("请黑棋下子");
    TextField txt2=new TextField();
    TextField txt3=new TextField();
    //构造方法
    ChessPad(){
        this.setSize(440,400);
        this.setLayout(null);
        addMouseListener(this);
        btn.setBounds(10,5,60,26);
        btn.addActionListener(this);
        this.add(btn);
        //
        this.add(txt1);
        this.add(txt3);
        txt3.setBounds(40,405,380,50);
        txt1.setBounds(90,5,90,24);
        txt2.setBounds(290,5,90,24);
        this.add(txt2);
        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(false);
    }
    //绘制棋盘外观
    @Override
    public void paint(Graphics g){
        //绘制棋盘直线
        for (int i = 40; i <=380; i+=20) {
            g.drawLine(40,i,400,i);
        }
        //绘制棋盘下边界
        g.drawLine(40,400,400,400);
        //绘制棋盘竖线
        for (int j = 40; j <=380 ; j+=20) {
            g.drawLine(j,40,j,400);
        }
        //绘制右边界
        g.drawLine(400,40,400,400);
        //添加五个椭圆形
        g.fillOval(97,97,6,6);
        g.fillOval(337,97,6,6);
        g.fillOval(97,337,6,6);
        g.fillOval(337,337,6,6);
        g.fillOval(217,217,6,6);
    }
    //
    //实现重新开局
    @Override
    public void actionPerformed(ActionEvent e) {
        this.removeAll();
        chessmancolor=1;
        add(btn);
        btn.setBounds(10,5,60,26);
        txt1.setBounds(10,5,60,26);
        txt1.setText("请黑棋下子");
        add(txt1);
        txt2.setText("");
        txt2.setBounds(290,5,90,24);
        add(txt2);
    }



    @Override
    public void mousePressed(MouseEvent e) {//鼠标按下操作
        //如果用户单击棋子，记录棋子坐标

        if (e.getModifiers()== InputEvent.BUTTON1_MASK){//鼠标左键
            //获取x,y坐标
            x=(int)e.getX();
            y=(int)e.getY();
            //创建黑白棋子
            ChessPint_black blackPoint=new ChessPint_black(this);
            ChessPint_white whitePoint=new ChessPint_white(this);
            //
            int a=(x+10)/20,b=(y+10)/20;

            //判断鼠标边界
            if (x/40<1||y/40<1||x/40>9||y/40>9){

            }else {
                if (chessmancolor==1){
                    this.add(blackPoint);
                    blackPoint.setBounds(a*20-7,b*20-7,16,16);
                    chessArr[(y+10)/20-1][(x+10)/20-1]=chessmancolor;
                    //blackPoint.setBounds(x-7,y-7,16,16);
                    chessmancolor=chessmancolor*(-1);
                    txt2.setText("请白棋下子");
                    txt1.setText("");
                }else if (chessmancolor==-1){
                    this.add(whitePoint);
                   whitePoint.setBounds(a*20-7,b*20-7,16,16);
                    //whitePoint.setBounds(x-7,y-7,16,16);
                    chessArr[(y+10)/20-1][(x+10)/20-1]=chessmancolor;
                    chessmancolor=chessmancolor*(-1);
                    txt1.setText("请黑棋下子");
                    txt2.setText("");
                }
            }
        }
        int xx=(y+10)/20-1;
        int yy=(x+10)/20-1;
        Win();
        IsblacOrwhite(xx,yy);
    }
//判断输赢
    //每点一次 记录坐标   数组
    public static void Win(){
        System.out.println("-----------------------------");
        for (int i = 0; i <chessArr.length; i++) {
            for (int j = 0; j <chessArr.length; j++) {
                System.out.print(chessArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*****************************");
    }
    public void IsblacOrwhite(int x,int y){
        //判断输赢
        //纵行判断
        int sum=0,tmp=0;
        boolean flag=true;
        tmp=chessArr[x][y];
        if (tmp!=0) {
            for (int i = 0; i <= 4; i++) {
                if (chessArr[x + i][y] == tmp) {
                    sum += chessArr[x + i][y];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        //System.exit(0);
                    }
                } else {
                    break;
                }
            }
            for (int j = -1; j >= -4; j--) {
                if (chessArr[x + j][y] == tmp ) {
                    sum += chessArr[x + j][y];
                    //
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }
            }
//横向判断
            sum = 0;
            for (int i = 0; i <= 4; i++) {
                if (chessArr[x][y + i] == tmp) {
                    sum += chessArr[x][y + i];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }

            }
            for (int j = -1; j >= -4; j--) {
                if (chessArr[x][y + j] == tmp) {
                    sum += chessArr[x][y + j];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }
            }
//交叉判断
            //左上角
            sum = 0;
            for (int k = 0; k <= 4; k++) {
                if (chessArr[x - k][y - k] == tmp) {
                    sum += chessArr[x - k][y - k];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }
            }
            for (int i = 1; i <= 4; i++) {
                if (chessArr[x + i][y + i] == tmp) {
                    sum += chessArr[x + i][y + i];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }
            }
//对角线
            //右上角
            sum = 0;
            for (int k = 0; k <= 4; k++) {
                if (chessArr[x + k][y - k] == tmp ) {
                    sum += chessArr[x + k][y - k];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }
            }
            for (int i = 1; i <= 4; i++) {
                if (chessArr[x - i][y + i] == tmp ) {
                    sum += chessArr[x + i][y + i];
                    if (sum == 5) {
                        txt3.setText("黑棋胜利!!");
                        //System.exit(0);
                    } else if (sum == -5) {
                        txt3.setText("白棋胜利!!");
                        // System.exit(0);
                    }
                } else {
                    break;
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
