package com.zz.student.override;

import lombok.Data;

@Data
public class Student extends Person{
    private  int id;
    private  double score;
    public Student(String name,String age,int id,double score){
        super(name,age);
        this.id=id;
        this.score=score;
    }
    public String say(){
        return  super.say()+"我的id是"+id+"，我的成绩是"+score;
    }
//    public void cry(){
//        System.out.println("cry重写:方法");
//    }
}
