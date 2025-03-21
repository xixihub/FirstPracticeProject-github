package com.zz.student.Generics_;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@Data
public class User {
    private int id;
    private String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
