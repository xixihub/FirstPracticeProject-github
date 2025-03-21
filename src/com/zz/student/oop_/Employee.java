package com.zz.student.oop_;

public class Employee {
   private String name;
   private double sal;
    private String job;
    public Employee(String name, double sal, String job)
    {
        this.name=name;
        this.sal=sal;
        this.job=job;
        System.out.println("姓名："+this.name+"\n薪水："+this.sal+"\n职位："+this.job);
    }
}
