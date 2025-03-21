package com.zz.student.poly_;

import lombok.Data;

@Data
public class Persons {
    private String name;
    private  int age;
    private  String job;
    private  int sex;

    public Persons(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Persons(String name, int age, int sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void show(){
        System.out.println("name:"+name+" age:"+age);
    }
    @Override
    public  boolean equals(Object o1) {
        if(this==o1){
            return  true;
        }else if (o1 instanceof Persons){
            Persons p=(Persons) o1;
            return  this.name.equals(p.name) && this.age==p.age;
        }
        return false;
    }
    public  void run() {
        System.out.println("person run");
    }
    public  void walk() {
        System.out.println("person walk");
    }
    public String play(){
        return "person play";
    }
}
