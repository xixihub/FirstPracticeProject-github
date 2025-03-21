package com.zz.student.HashMap_;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author zz
 * @version 1.0
 * @Description 员工
 */
@Data
public class Employee {
    /**
     * 员工编号
     */
    private int id;



    /**
     * 姓名
     */
    private String name;
    /**
     * 工资
     */
    private BigDecimal salary;
    private MyDate birthday;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(int id, String name, BigDecimal salary, MyDate birthday) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }
}
