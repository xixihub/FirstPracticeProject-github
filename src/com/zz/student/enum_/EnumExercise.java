package com.zz.student.enum_;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zz
 * @version 1.0
 */
public enum EnumExercise {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    public String getName() {
        return name;
    }

    @Deprecated
    private String name;


    EnumExercise(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnumExercise{" +
                "name='" + name + '\'' +
                '}';
    }
}
