package com.zz.student.override;

import lombok.Data;

@Data
public class Person {
    private String name;
    private  String age;
    public Person(String name,String age){
        this.name = name;
        this.age = age;
    }
public String say(){

    return  "name:"+name+" age:"+age;
}
public void cry(){
        System.out.println("cry:方法");
}
}
