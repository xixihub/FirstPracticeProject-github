package com.zz.student.enum_;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class EnumMain {
    public static void main(String[] args) {
        EnumExercise[] e = EnumExercise.values();
        System.out.println("==========输出所有的信息==========");
        for (EnumExercise enumExercise : e) {
            System.out.println(enumExercise.getName());
        }
    }
}
