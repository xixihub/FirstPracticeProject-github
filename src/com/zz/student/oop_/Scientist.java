package com.zz.student.oop_;

public class Scientist extends Employee{
    private double bonus;
    public Scientist(String name, double sal, String job,double bonus){
        super(name,sal+bonus,job);
    }
}
