package com.zz.student.abstract_;

public class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("CommonEmployee work"+getName());
    }
}
