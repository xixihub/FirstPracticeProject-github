package com.zz.student.reflection_;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zzvvv
 * @version 1.0
 * @Description 反射联系
 */
public class ReflectionWork {
    public static void main(String[] args) {
        try {
            Class<?> fileClass = Class.forName("java.io.File");
            Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
            for (Constructor<?> constructor : declaredConstructors) {
                System.out.println(constructor);
            }
            Constructor<?> declaredConstructor = fileClass.getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
            Object o1 = declaredConstructor.newInstance("D:\\myfile\\myfile1\\test.txt");
            fileClass.getDeclaredMethod("createNewFile").invoke(o1);
            System.out.println(o1);
//            Class<?> aClass = Class.forName("com.zz.student.reflection_.PrivateTest");
//            Object o = aClass.newInstance();
//            Field name = aClass.getDeclaredField("name");
//            name.setAccessible(true);
//            name.set(o,"zz");
//            System.out.println(name.get(o));
//            Method test1 = aClass.getDeclaredMethod("test", String.class,int.class,double.class);
//            test1.setAccessible(true);
//            Object test = test1.invoke(o, "zz",1,1.0);
//            System.out.println(test);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
