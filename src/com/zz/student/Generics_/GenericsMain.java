package com.zz.student.Generics_;

import java.util.HashMap;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class GenericsMain {
    public static void main(String[] args) {
//        GenericsClass genericsClass=new GenericsClass();
//        genericsClass.show("zz");
        Dao<User> dao = new Dao("zz", new HashMap<>());
        dao.save("zz", new User(1, "zz"));
        dao.show();
        System.out.println(dao.showList());
        dao.update("zz", new User(2, "zz"));
        System.out.println(dao.showList());
        dao.delete("zz");
        System.out.println("123"+dao.showList());
    }


}
