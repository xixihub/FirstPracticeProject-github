package com.zz.student.final_;

/***
 * @ClassName: FinalClass
 * @Description:final 类学习
 * @Version: 1.0
 * @author zz
 */
@SuppressWarnings("all")
public class FinalClass {
    public static void main(String[] args) {
        //final修饰的类不能被继承
        //final修饰的类不能被实例化
        //final修饰的类的成员变量可以被修改
        //final修饰的类的成员方法可以被重写
        //final修饰的类的静态成员变量可以被修改
        //final修饰的类的静态成员方法可以被重写
        //final修饰的类的静态成员方法不能被重载
        Circle a=new Circle(10);
        A b=new A();
        b.test();
    }
}
 final class  A{
    private final static int NUM=10;
    public final   void test(){
        final int NUM=20;
        System.out.println(NUM);
        System.out.println("A");
    }
}
//
//class B extends A{
//    @Override
//    public void test(){
//        System.out.println("B");
//    }
//}