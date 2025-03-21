package com.zz.student0130;

import lombok.Data;

/***
 * @author zz
 * @version 1.0
 * 继承类学习
 */
@Data
public class Extends {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

//    public Extends() {
//        System.out.println("父类:Extends");
//    }

    public Extends(int n1) {
        System.out.println("父类有参构造器:Extends");
    }

    void test100() {
        System.out.println("test100");
    }

    public void test200() {
        System.out.println("test200");
    }

    protected void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void test500() {
        test400();
    }
}
