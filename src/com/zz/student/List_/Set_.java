package com.zz.student.List_;

import java.util.Iterator;

/**
 * @author zz
 * @version 1.0
 * @Description set集合
 */
public class Set_ {
    public static void main(String[] args) {
        java.util.Set set = new java.util.HashSet();
        set.add("java");
        set.add("java1");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("java");
       set.add("java");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
