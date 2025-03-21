package com.zz.student.abstract_;

import lombok.Data;

@Data
abstract public class Employee  {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    abstract public void work();
    public void work1()
    {
        System.out.println("员工"+name+"在工作");
    }
}
