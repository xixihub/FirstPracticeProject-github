package com.zz.student.abstract_;


public class Manager extends Employee{
    private double bonus;
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public Manager(String name, int id, double salary)
    {
        super(name, id, salary);
    }

    @Override
    public void work()
    {
        System.out.println("Manager is working"+getName());
    }
}
