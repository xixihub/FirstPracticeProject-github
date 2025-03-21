package com.zz.student.abstract_;

abstract public class Template {
    abstract public  void job();
    public void work(){
        long strat=System.currentTimeMillis();
        job();
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-strat)+"ms");
    }
}
