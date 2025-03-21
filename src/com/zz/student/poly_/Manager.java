package com.zz.student.poly_;

public class Manager extends Employee{
    private  double bonus;
    public Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    @Override
    public double getAnnualSalary(){
        return super.getAnnualSalary()+bonus;
    }
    public void show(){
        System.out.println("salary:"+getAnnualSalary());
    }
}
