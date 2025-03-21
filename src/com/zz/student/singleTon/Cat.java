package com.zz.student.singleTon;

/***
 * @ClassName: Cat
 * @Description: 单例模式 懒汉式
 * @Version: 1.0
 * @Since: 2021-01-02 14:56:00
 * @author zz
 */
public class Cat {
    private static Cat cat = null;
    private Cat() {
        System.out.println("创建对象");
    }
    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat();
        }
        return cat;
    }
}
