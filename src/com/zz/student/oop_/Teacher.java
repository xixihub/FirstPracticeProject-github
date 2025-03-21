package com.zz.student.oop_;

public class Teacher extends Employee{
    private int day;
    private  double salary;
public Teacher(String name, double sal, String job,int day,double salary){
    super(name,sal+(day*salary),job);
    this.day=day;
    this.salary=salary;
}
}
