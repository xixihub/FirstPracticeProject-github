package com.zz.student.Interface;

public class Oracle implements DBConnect{
    public void connect()
    {
        System.out.println("连接oracle数据库");
    }
    public void disconnect()
    {
        System.out.println("断开oracle数据库");
    }
}
