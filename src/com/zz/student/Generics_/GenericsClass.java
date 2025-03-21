package com.zz.student.Generics_;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class GenericsClass implements  GenericsA<String>{

    @Override
    public void show(String s) {
        System.out.println("show String"+s);
    }
}
