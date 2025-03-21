package com.zz.student.tankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@SuppressWarnings("all")
public class Panel extends JPanel implements KeyListener, Runnable {
    Hery hery = null;
    Vector<Enemy> enemyVector = new Vector<>();
    int enemyVectorsize = 5;

    public Panel() {
        hery = new Hery(100, 100, 0);
        hery.setSpeed(6);


        for (int i = 0; i < enemyVectorsize; i++) {
            Enemy enemy = new Enemy(100 * (i + 1), 0, 2);
            enemy.setSpeed(2);
            new Thread(enemy).start();
            TankBullet tankBullet = new TankBullet(enemy.getX() + 20, enemy.getY() + 60, enemy.getDirect());
            enemy.getBullets().add(tankBullet);
            new Thread(tankBullet).start();
            enemyVector.add(enemy);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint");
        g.fillRect(0, 0, 1000, 750);
        if (hery != null && hery.getLive()) {
            drawTank(hery.getX(), hery.getY(), g, hery.getDirect(), 0);
        }
        for (int i = 0; i < enemyVector.size(); i++) {
            Enemy enemy = enemyVector.get(i);
            if (enemy.getLive()) {
                drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 1);
                for (int j = 0; j < enemy.getBullets().size(); j++) {
                    TankBullet tankBullet = enemy.getBullets().get(j);
                    if (tankBullet.getLive()) {
                        g.draw3DRect(tankBullet.getX(), tankBullet.getY(), 2, 2, false);
                    } else {
                        enemy.getBullets().remove(tankBullet);
                    }
                }
            }
        }
        for (int a = 0; a < hery.getBullets().size(); a++) {
            TankBullet tankBullet = hery.getBullets().get(a);
            if (tankBullet != null && tankBullet.getLive()) {
                g.draw3DRect(tankBullet.getX(), tankBullet.getY(), 2, 2, false);
            } else {
                hery.getBullets().remove(tankBullet);
            }
        }
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
            default:
                g.setColor(Color.CYAN);
                break;
        }
        switch (direct) {
            case 0://上
                g.fill3DRect(x, y, 10, 60, false);//左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间矩形
                g.fillOval(x + 10, y + 20, 20, 20);//圆盖
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://右
                g.fill3DRect(x, y, 60, 10, false);//左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//中间矩形
                g.fillOval(x + 20, y + 10, 20, 20);//圆盖
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://下
                g.fill3DRect(x, y, 10, 60, false);//左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间矩形
                g.fillOval(x + 10, y + 20, 20, 20);//圆盖
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://左
                g.fill3DRect(x, y, 60, 10, false);//左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//中间矩形
                g.fillOval(x + 20, y + 10, 20, 20);//圆盖
                g.drawLine(x + 30, y + 20, x, y + 20);
            default:
                ;
        }
    }

    public void hitEnemyTank(TankBullet tankBullet, Tank enemy) {
        switch (enemy.getDirect()) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                if (tankBullet.getX() > enemy.getX() && tankBullet.getX() < enemy.getX() + 40
                        && tankBullet.getY() > enemy.getY() && tankBullet.getY() < enemy.getY() + 60) {
                    tankBullet.setLive(false);
                    enemy.setLive(false);
                    enemyVector.remove(enemy);
                }

                break;
            case 3:
                if (tankBullet.getX() > enemy.getX() && tankBullet.getX() < enemy.getX() + 60
                        && tankBullet.getY() > enemy.getY() && tankBullet.getY() < enemy.getY() + 40) {
                    tankBullet.setLive(false);
                    enemy.setLive(false);
                    enemyVector.remove(enemy);
                }
                break;
            default:
                break;
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                hery.setDirect(0);
                hery.moveUp();
                break;
            case KeyEvent.VK_D:
                hery.setDirect(1);
                hery.moveRight();
                break;
            case KeyEvent.VK_S:
                hery.setDirect(2);
                hery.moveDown();
                break;
            case KeyEvent.VK_A:
                hery.setDirect(3);
                hery.moveLeft();
                break;
            case KeyEvent.VK_J:
                hery.bulletshot();
                break;
            default:
                System.out.println("输入错误~");
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void hitEnemyTanks() {
        for (int a = 0; a < hery.getBullets().size(); a++) {
            TankBullet heryBullet = hery.getBullets().get(a);
            if (heryBullet != null && heryBullet.getLive()) {
                for (int i = 0; i < enemyVector.size(); i++) {
                    hitEnemyTank(hery.getBullet(), enemyVector.get(i));
                }
            }
        }
    }

    public void hitHeryTanks() {
        for (int a = 0; a < enemyVector.size(); a++) {
            Enemy enemy = enemyVector.get(a);
            for (int i = 0; i < enemy.getBullets().size(); i++) {
                TankBullet tankBullet = enemy.getBullets().get(i);
                if (tankBullet != null && tankBullet.getLive()) {
                    hitEnemyTank(tankBullet, hery);
                }
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hitEnemyTanks();
            hitHeryTanks();
//            if (hery.getBullet() != null && hery.getBullet().getLive()) {
//                for (int i = 0; i < enemyVector.size(); i++) {
//                    hitEnemyTank(hery.getBullet(), enemyVector.get(i));
//                }
//            }
            this.repaint();
        }
    }
}
