package com.zz.student.StringBuffer_;

import java.util.Random;

/**
 * @author zz
 * @version 1.0
 * @Description StringBuffer学习
 */
public class StringBufferMethod {
    StringBuffer sb = new StringBuffer("hello");
    public static void main(String[] args) {
        System.out.println(getRandom(2,7));


    }

    /***
     * 取a-b之间的随机数
     * @param a
     * @param b
     * @return
     */
    public static int getRandom(int a,int b){
        Random random = new Random();
        System.out.println(random.nextInt(b-a+1)+a);
        return (int)(Math.random()*(b-a))+a;

    }
}
