package com.zz.student.poly_;

public class Worker extends Employee{
    public Worker(String name, double salary)
    {
        super(name,salary);
    }
    public void show()
    {
        System.out.println("I am a worker");
    }
}
