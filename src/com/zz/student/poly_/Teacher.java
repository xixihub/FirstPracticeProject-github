package com.zz.student.poly_;

public class Teacher extends Persons{
    private double salary;
    private int work_age;

    public Teacher(String name, int age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }
    public Teacher(String name, int age, int work_age, int sex){
        super(name, age, sex);
        this.work_age = work_age;
    }
    @Override
    public void show()
    {
        super.show();
        System.out.println("工资："+salary);
    }
    public void show1(){
        System.out.println("老师工资："+salary);
    }
    public void teach(){
        System.out.println("我承诺我会认真教学。");
    }
    @Override
    public String play(){
        return this.getName()+"爱玩象棋";
    }
}
