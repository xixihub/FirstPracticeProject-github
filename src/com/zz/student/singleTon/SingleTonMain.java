package com.zz.student.singleTon;

public class SingleTonMain {
    public static void main(String[] args) {
        GridFriend gf1 = GridFriend.getInstance("张三");
        System.out.println(gf1);
        System.out.println(GridFriend.getInstance("张三1"));
        System.out.println(gf1==GridFriend.getInstance("张三2"));
        Cat cat=Cat.getInstance();
        System.out.println(cat==Cat.getInstance());
    }
}
