package com.zz.student.File_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zz
 * @version 1.0
 * @Description 创建文件目录
 * @date 2020/2/26 21:04
 * @Copyright © 2020-2021
 * @Created by zz
 */
public class DicryFile {
    public static void main(String[] args) throws IOException {
        //创建目录
        //mkdir()方法只能创建一级目录
        //mkdirs()方法可以创建多级目录
        String filePath = "D:\\myfile\\myfile2\\2.txt";
        File file = new File(filePath);
        int readx;
        byte [] bytes = new byte[1024];
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        try {
            fileOutputStream.write("我是一个文件".getBytes(), 0, "我是一个文件".getBytes().length);
            fileOutputStream.write("我是一个文件".getBytes());

        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
//        if (file.exists()){
//
//        FileInputStream fileInputStream = new FileInputStream(file);
//        try {
//            while ((readx = fileInputStream.read(bytes)) != -1) {
//                System.out.print(new String(bytes, 0, readx));
//            }
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                if (fileInputStream != null) {
//                    fileInputStream.close();
//                }
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//        }
//        System.out.println(file.exists());
//        if (!file.exists()) {
//            file.mkdirs();
//        }else{
//           System.out.println("目录已存在");
//        }
//
//  System.out.println(file.getParent());
//  System.out.println(file.getName());
//  System.out.println(file.getAbsolutePath());
//
//  System.out.println(file.isDirectory());
//  System.out.println(file.isFile());
//  System.out.println(file.canRead());
//  System.out.println(file.canWrite());
//  System.out.println(file.canExecute());
//  System.out.println(file.length());
//  System.out.println(file.lastModified());
//  System.out.println(file.getFreeSpace());


//        if (file.exists()) {
//            File paterntFile = new File(filePath, "c.txt");
//            paterntFile.createNewFile();
//
////            faFile.createNewFile();
//            System.out.println("目录已存在"+paterntFile.getAbsoluteFile()+paterntFile.getName()+"文件已创建");
//        } else {
//            try {
//                if (file.mkdirs()) {
//                    File faFile = new File(file, "b.txt");
//                    faFile.createNewFile();
//                    System.out.println(faFile.getAbsoluteFile()+faFile.getName()+"文件已创建");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }
}
