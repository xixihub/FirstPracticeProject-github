package com.zz.student.homeWork;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public enum Color implements ColorInterface {
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    YELLOW(255,255,0),
    WHITE(255,255,255),
    BLACK(0,0,0);
    private int r,g,b;

    Color(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public int getR(){
        return r;
    }
    public int getG(){
        return g;
    }
    public int getB(){
        return b;
    }
    @Override
    public void show(){
        System.out.println("r:"+r+"g:"+g+"b:"+b);
    }
}

interface ColorInterface{
    void show();
}