package com.zz.student.oop_;

import java.text.ParseException;
import java.util.Scanner;

public class SmailChageSysApp {
    public static void main(String[] args) throws ParseException {
        Boolean loop=true;
        SmallChangeSysOOP s1 = new SmallChangeSysOOP();
        s1.Menu();
        double money=0;
        while (loop) {
            System.out.println("输入1.存钱 2.消费 3.明细 4.退出");
            Scanner sc = new Scanner(System.in);
            int type=sc.nextInt();
            switch (type){
                case 1:
                    System.out.println("请输入充值金额:");
                     money=sc.nextDouble();
                    if(money<=0){
                        System.out.println("充值金额不能小于0，请重新输入:");
                        break;
                    }
                    s1.setName("收益入账");
                    s1.RevenueEntry(money);
                    break;
                case 2:
                    System.out.println("请输入消费金额:");
                     money=sc.nextDouble();
                    if(money<=0 || money>s1.getBlance()){
                        System.out.println("充值金额不能小于0，请重新输入:");
                        break;
                    }
                    s1.setName("消费");
                    s1.Consumption(money);
                    break;
                case 3:
                    s1.Detail();
                    break;
                case 4:
                    System.out.println("请输入是否退出 y/n:");
                    loop=s1.Quit(sc.next());
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
                }
            }

    }
}
