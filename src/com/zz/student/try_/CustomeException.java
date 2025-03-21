package com.zz.student.try_;

/**
 * @author zz
 * @version 1.0
 * @Description 自定义异常
 */
public class CustomeException extends RuntimeException{
    public CustomeException(String message){
        super(message);
    }
}
