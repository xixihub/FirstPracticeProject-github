package com.zz.student.homeWork;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@Data
public class Car2 {
    private double temperature;
    public Car2(double temperature){
        this.temperature=temperature;
    }
    class Air{
        public void flow(){
            if (temperature>40){
                System.out.println("空调吹冷气");
            } else if (temperature<0) {
                System.out.println("空调吹热气");
            }else {
                System.out.println("空调不工作");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
