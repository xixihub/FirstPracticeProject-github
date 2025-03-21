package com.zz.student.homeWork;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
 public interface Calculator {
     public int add(int a,int b);
}
 class Callphone{
     public void call(Calculator calculator,int a,int b){
          System.out.println("计算后的结果是："+calculator.add(a,b));
      }
}