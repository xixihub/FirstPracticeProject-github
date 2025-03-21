package com.zz.student.abstract_;

/***
 * @description 抽象类学习
 * @create 2021-06-06 16:55
 * @author zz
 * @version 1.0
 * @package com.zz.student.abstract_
 */
public class AbstractMain {
    public static void main(String[] args) {
        // 练习题
        Animal cat=new Cat();
        cat.shout();
        Animal dog=new Dog();
        dog.shout();
        Animal cat2=new Cat(){
            @Override
            public void shout()
            {
                System.out.println("喵喵喵");
            }
        };
        cat2.shout();
        //抽象类学习
        Job1 j1 = new Job1();
        j1.work();
        Job2 j2 = new Job2();
        j2.work();

        CommonEmployee ce = new CommonEmployee("张三", 1, 10000);
        ce.work();
       Manager m = new Manager("李四", 2, 20000);
        m.work();
        m.setBonus(1000);

    }
}
