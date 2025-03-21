package com.zz.student.singleTon;

import lombok.Data;

import static sun.awt.image.PixelConverter.Argb.instance;

/***
 * @ClassName: GridFriend
 * @Description: 单例模式
 * @Version: 1.0
 * @Since: 2021-01-21 14:56:00
 * @author zz
 */
@Data
public class GridFriend {
    private String name;
    private static GridFriend gridFriend=new GridFriend("11");
    private GridFriend(String name){
        this.name=name;
        System.out.println("单例模式 GridFriend 构造方法");
    }
    public static GridFriend getInstance(String name){
        return  gridFriend;
    };
}
