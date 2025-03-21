package com.zz.student.abstract_;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
abstract public class Animal {
    abstract void shout();
}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("wang wang");
    }
}
class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
