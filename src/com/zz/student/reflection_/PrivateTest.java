package com.zz.student.reflection_;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@Data
public class PrivateTest {
    private String name="hellokitty";
    private void test(String a,int b,double c){
        System.out.println(name+"test"+a+b+c);
    }
}
