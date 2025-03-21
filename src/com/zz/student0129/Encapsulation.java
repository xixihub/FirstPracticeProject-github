package com.zz.student0129;

import lombok.Data;

@Data
public class Encapsulation {

    /**
     * 姓名
     */
    private  String name;
    /**
     * 年龄
     */
    private  int age;
    /**
     * 薪水
     */
    private  double salary;
    public Encapsulation(){}
    public Encapsulation(String name,int age,double salary){
//        this.name=name;
//        this.age=age;
//        this.salary=salary;
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }
    public  String info(){
        return  "name="+name+"age="+age+"薪水="+salary;
    }
}
