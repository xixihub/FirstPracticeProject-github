package com.zz.student.poly_;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public double getAnnualSalary()
    {
        return salary*12;
    }
}
