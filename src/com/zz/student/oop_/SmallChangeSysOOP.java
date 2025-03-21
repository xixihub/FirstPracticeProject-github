package com.zz.student.oop_;

import lombok.Data;

import javax.swing.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * @author zz
 * @description:零钱通oop实现
 * @create 2019-08-22 16:36
 * @version V1.0
 */
@Data
public class SmallChangeSysOOP {
    /**
     * 项目名称
     */
    private String name;
    /**
     * 收益金额
     */
    private double money;
    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 余额
     */
    private double blance;
    /**
     * 备注
     */
    private String remark;
    public SmallChangeSysOOP() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        this.createdate = sdf.parse(sdf.format(new Date()),pos);
        System.out.println(this.createdate);
        this.remark="";
    }
    /***
     * 打印菜单方法
     */
    public void Menu() {
        System.out.println("=====================欢迎使用零钱通系统===============");
        System.out.println("                      1.零钱通明细                  ");
        System.out.println("                      2.收益入账                  ");
        System.out.println("                      3.消费                  ");
        System.out.println("                      4.退     出                  ");
    }

    /***
     * 零钱通明细方法
     */
    public void Detail() {
        System.out.println("=====零钱通明细=====");
        System.out.println(this.remark);
    }

    /***
     * 收益入账方法
     */

    public void RevenueEntry(double money) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.money += money;
        this.blance += money;
        System.out.println("====收益入账成功=====");
        System.out.println("====当前余额=====");
        System.out.println(this.blance);
        System.out.println("====当前收益=====");
        System.out.println(money);
        this.remark +="\n"+ this.name + " 本次收益了 " + money + " 元" + "\t当前余额：" + this.blance + "元；消费时间："+ sdf.format(new Date());
    }

    /***
     * 消费方法
     */
    public void Consumption(double money) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.blance -= money;
        System.out.println("====消费成功=====");
        System.out.println("====当前余额=====");
        System.out.println(this.blance);
        System.out.println("====当前消费金额=====");
        System.out.println("-" + money);
        this.remark += "\n"+this.name + " 本次消费了 " + money + " 元" + "\t当前余额：" + this.blance + "元；消费时间："+ sdf.format(new Date());
    }

    /***
     * 退出方法
     */
    public Boolean Quit(String type) {
        if (type.equals("Y")) {
            System.out.println("====欢迎下次使用=====");
            return false;
        }
        return true;
    }
}
