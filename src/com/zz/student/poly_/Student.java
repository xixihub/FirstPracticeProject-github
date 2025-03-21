package com.zz.student.poly_;

public class Student extends Persons {
    private double score;
    private String name;
    private int age;
    private String stu_id;
    private int sex;
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    public Student(String name, int age, String stu_id, int sex) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" score:" + score);
    }
    public void show1() {
        System.out.println("学生的分数score:" + score);
    }
    @Override
    public void walk() {
        System.out.println("学生走");
    }
    @Override
    public void run() {
        System.out.println("学生跑");
    }
    public void study(){
        System.out.println("学生学习");
    }
    @Override
    public String play() {
        return this.getName()+"学生玩游戏";
    }
}
