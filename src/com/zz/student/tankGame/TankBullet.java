package com.zz.student.tankGame;


import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description 坦克子弹
 */
@Data
public class TankBullet extends Tank implements Runnable {
    /***
     * 子弹个数
     */
    private int count;
    private Boolean live = true;

    public TankBullet(int x, int y, int direct) {
        super(x, y, direct);
    }

    @Override
    public void run() {
        System.out.println("开始起线程确定子弹方向位置！");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shot();
            System.out.println(getX() + ":" + getY());
            if (getX() < 0 || getY() < 0 || getX() > 1000 || getY() > 750 || !getLive()) {
                System.out.println("碰到边界了子弹销毁"+getX() + ":" + getY());
                live = false;
                break;
            }
        }

    }

    public void shot() {
        switch (getDirect()) {
            case 0:
                setY(getY() - getSpeed());
                break;
            case 1:
                setX(getX() + getSpeed());
                break;
            case 2:
                setY(getY() + getSpeed());
                break;
            case 3:
                setX(getX() - getSpeed());
                break;
        }
    }
}
