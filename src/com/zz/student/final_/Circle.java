package com.zz.student.final_;

import lombok.Data;

/***
 * @deprecated final练习
 * @author zz
 * @version 1.0
 */
@Data
@Deprecated
public class Circle {
    private double radius;
    private final static double PI=3.14;
    public Circle(int radius) {
        this.radius = radius;
        System.out.println("圆的半径为："+radius);
        System.out.println("圆的周长为："+2*PI*radius);
        System.out.println("圆的面积为："+PI*radius*radius);
    }
}
