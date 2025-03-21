package com.zz.student.try_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author zz
 * @version 1.0
 * @Description 异常练习
 */
public class ThrowsExercise {
    public static void main(String[] args) {
        //自定义异常
        if(true){
            throw new CustomeException("自定义异常");
        }
        System.out.println("hello");
        //练习题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        String name = scanner.next();
        Boolean flag = false;

        do {
            try {
                int a = Integer.parseInt(name);
                flag = true;
                System.out.println("输入正确!");
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请重新输入：");
                name = scanner.next();
            }
        } while (!flag);
    }
    //运行异常不抛出无影响
    public static void t2() throws Exception {
        try {
            t1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void t1() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("");
    }
}
