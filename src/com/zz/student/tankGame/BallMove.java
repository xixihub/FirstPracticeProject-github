package com.zz.student.tankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class BallMove extends JFrame {
    MyPanel myPanel;
    public BallMove() {
        setSize(400, 300);
        myPanel = new MyPanel();
        this.add(myPanel);
        this.addKeyListener(myPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
}
class MyPanel extends JPanel implements KeyListener {
    private int x = 100;
    private int y = 100;
    public MyPanel() {
        setSize(400, 300);
        setBackground(Color.BLACK);
    }
@Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 20);
        this.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()){
        case KeyEvent.VK_UP:
            y -= 10;
            break;
        case KeyEvent.VK_DOWN:
            y += 10;
            break;
        case KeyEvent.VK_LEFT:
            x -= 10;
            break;
        case KeyEvent.VK_RIGHT:
            x += 10;
            break;
        default:
            break;
    }
    repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
