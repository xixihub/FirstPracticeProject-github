package com.zz.student.tankGame;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description 坦克
 */
@Data
public class Tank {
    /**
     * 横坐标 x
     */
    private int x;
    /**
     * 纵坐标 y
     */
    private int y;
    /**
     * 方向 顺时针0123
     */
    private int direct=0;
    /**
     * 速度
     */
    private int speed = 5;
    /**
     * 坦克数量
     */
    private int tanksize;
    private Boolean live = true;
    public Tank() {
    }

    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public void moveDown() {
        y+=speed;
    }

    public void moveUp() {
        y-=speed;
    }

    public void moveLeft() {
        x-=speed;
    }

    public void moveRight() {
        x+=speed;
    }
}
