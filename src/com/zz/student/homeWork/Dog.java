package com.zz.student.homeWork;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@Data
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
