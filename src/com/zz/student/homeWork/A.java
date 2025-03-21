package com.zz.student.homeWork;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class A {
    private final static int name =2;
    public void show1(){
        class B{
            private final static int name =1;
            public void show(){
                System.out.println(name);
                System.out.println(A.name);
            }
        }
        B b = new B();
        b.show();
    }
}
