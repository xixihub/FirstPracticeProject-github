package com.zz.student.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class DrawCircle extends JFrame {
    public static void main(String[] args) {
        DrawCircle drawCircle = new DrawCircle();
        drawCircle.setVisible(true);
        drawCircle.setSize(400,400);
        drawCircle.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        drawCircle.add(new Circle());
    }
}
class Circle extends JPanel{


    @Override
   public void paint(Graphics g){
        super.paint(g);
//        g.drawOval(10,10,100,100);
//        System.out.println("paint");
//        g.drawLine(10,20,100,100);
//        g.drawRect(10,30,100,100);
//        g.drawArc(10,40,100,100,0,360);
//        g.drawOval(10,50,200,100);
//        g.setColor(Color.BLUE);
//        g.fillOval(10,60,100,100);
//        g.fillRect(10,70,100,100);
//        g.drawImage(Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/202706.png")),10,80,1055,1000,this);
//        g.setFont(new Font("微软雅黑",Font.BOLD,20));
//        g.drawString("你好",10,90);
        g.setColor(Color.orange);
        g.fillRect(50,50,10,50);
        g.fillRect(60,60,30,30);
        g.fillRect(90,50,10,50);
        g.setColor(Color.BLUE);
        g.fillOval(60,60,30,30);
        g.drawLine(75,75,75,20);
    }
}
