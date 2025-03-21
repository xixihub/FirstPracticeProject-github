package com.zz.student.Interface;

public interface DBConnect {
    public void connect();
    public void disconnect();
    default public void close() {
    }
    public static void execute(String sql){

    };

}
