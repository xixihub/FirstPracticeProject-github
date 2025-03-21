package com.zz.student.homeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@SuppressWarnings("all")
public class HomeWorkMain {
    public static void main(String[] args) {
        //集合操作练习题
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("f");
        list1.add(1, "e");
        list1.add(2, "g");
        list1.get(4);
        list1.remove(5);
        list1.set(6, "h");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //遍历集合练习题
//        List<Dog> list = new ArrayList<>();
//        list.add(new Dog("旺财", 3));
//        list.add(new Dog("小花", 2));
//        list.add(new Dog("小黑", 1));
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            Dog dog = (Dog) iterator.next();
//            System.out.println(dog);
//        }
//        for (Dog dog : list) {
//            System.out.println(dog);
//        }


        //字符串反转
        String str=StrReverse.reverse("abc",0,2);
        System.out.println(str);
        Collection collection = null;

        //        Calculator c = new Calculator() {
//            @Override
//            public int add(int a,int b) {
//                return a+b;
//            }
//        };
//
//        //接口练习
//        Callphone callphone = new Callphone();
//        callphone.call(c,1,2);
//        //局部内部类练习
//        A a = new A();
//        a.show1();
//
        Person person1 = new Person("唐僧", new Boat());
        Person person2 = new Person("唐僧", new Horse());
        person1.show();
        person2.show();
        Person person3 = new Person("唐僧", new feijing());
        person3.show();
        //练习题
        Car2 car2 = new Car2(20);
        car2.getAir().flow();
        Color color = null;
        try {
            color = Color.RED;
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
            throw new RuntimeException(e);

        }
        color.show();
        switch (color) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
            case WHITE:
                System.out.println("白色");
                break;
            default:
                System.out.println("黑色");
        }
    }
}
