package com.zz.student.File_;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author zz
 * @version 1.0
 * @Description字符流读写
 */
public class FileRw {
    public static void main(String[] args) throws Exception {
        String inputFilePath = "D:\\myfile\\myfile1\\1.txt";
        writeFile(inputFilePath);
        readFile(inputFilePath);
    }
    public static void readFile(String inputFilePath) throws Exception{
        FileReader fr = new FileReader(inputFilePath);
        int ch = 0;
        char [] bytes = new char[8];
        try {
            while ((ch = fr.read(bytes)) != -1) {
                System.out.print((char) ch);
                System.out.print(new String(bytes, 0, ch));
            }
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    private static void writeFile(String inputFilePath) throws Exception{
        FileWriter fw = new FileWriter(inputFilePath, true);
        try {
            fw.write("你好xxx");
        }finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
