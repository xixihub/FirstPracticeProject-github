package com.zz.student.junit_;

import com.zz.student.Generics_.Dao;
import com.zz.student.Generics_.User;
import org.junit.jupiter.api.Test;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class CustorJunit {
    @Test
    public  void show(){
        System.out.println("show");
    }
    @Test
    public  void show1(){
        System.out.println("show");
    }
    @Test
    public void show2(){
        Dao<User> dao = new Dao("zz", new java.util.HashMap<>());
        dao.save("zz", new User(1, "zz"));
        dao.show();
        System.out.println(dao.showList());
        dao.update("zz", new User(2, "zz"));
        System.out.println(dao.showList());
        dao.delete("zz");
        System.out.println("123"+dao.showList());
    }
}
