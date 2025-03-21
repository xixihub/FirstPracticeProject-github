package com.zz.student.Interface;

public class MysqlConnect implements DBConnect{

    @Override
    public void connect() {

    }

    public void disconnect()
    {
        System.out.println("断开mysql数据库");
    }
}
