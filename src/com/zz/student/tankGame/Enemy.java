package com.zz.student.tankGame;

import lombok.Data;

import java.util.Vector;

/**
 * @author zz
 * @version 1.0
 * @Description 敌人的坦克
 */
@Data
public class Enemy extends Tank implements Runnable {
    private Vector<TankBullet> bullets = new Vector<>();
    private Boolean live = true;

    public Enemy(int x, int y, int direct) {
        super(x, y, direct);
    }


    @Override
    public void run() {
        while (true) {
            //发射多颗子弹
            if (getLive() && bullets.size()<1){
                TankBullet tankBullet = new TankBullet(getX() + 20, getY() + 20, getDirect());
              switch (getDirect()){
                  case 0:
                      tankBullet = new TankBullet(getX() + 20, getY(), getDirect());
                      break;
                  case 1:
                      tankBullet = new TankBullet(getX() + 60, getY()+20, getDirect());
                      break;
                  case 2:
                      tankBullet = new TankBullet(getX() + 20, getY()+60, getDirect());
                      break;
                  case 3:
                      tankBullet = new TankBullet(getX(), getY()+20, getDirect());
                      break;
              }
                bullets.add(tankBullet);
                new Thread(tankBullet).start();
            }
            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if(getY()>0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if(getX()+60<1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if(getY()+60<750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if(getX()>0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                default:
                    break;
            }
            setDirect((int) (Math.random() * 4));
            if (!getLive()) {
                break;
            }
        }
    }
}
