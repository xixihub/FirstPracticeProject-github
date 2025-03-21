package com.zz.student.tankGame;

import lombok.Data;

import java.util.Vector;

/**
 * @author zz
 * @version 1.0
 * @Description 自己的坦克
 */
@Data
public class Hery extends Tank {
    TankBullet bullet;
    Vector<TankBullet> bullets = new Vector<>();

    public Hery(int x, int y, int direct) {
        super(x, y, direct);
    }

    public void bulletshot() {
        switch (getDirect()) {
            case 0:
                bullet = new TankBullet(getX() + 20, getY(), getDirect());
                break;
            case 1:
                bullet = new TankBullet(getX(), getY() + 20, getDirect());
                break;
            case 2:
                bullet = new TankBullet(getX() + 20, getY() + 40, getDirect());
                break;
            case 3:
                bullet = new TankBullet(getX() + 40, getY() + 20, getDirect());
                break;
            default:
                break;
        }
        bullets.add(bullet);
        new Thread(bullet).start();
    }

}
