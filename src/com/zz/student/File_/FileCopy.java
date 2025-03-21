package com.zz.student.File_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class FileCopy {
    public static void main(String[] args) throws Exception {
        String inputFilePath = "D:\\myfile\\myfile1\\1.txt";
        String outputFilePath = "D:\\myfile\\myfile3\\3.txt";
        FileCopy.copyFile(inputFilePath,outputFilePath);

    }
    private static void copyFile(String inputFilePath,String outputFilePath) throws Exception{
        File outputFile = new File(outputFilePath);
        if (!outputFile.exists()){
            new File(outputFile.getParent()).mkdirs();
        }
        FileInputStream fis = new FileInputStream(inputFilePath);
        FileOutputStream fos = new FileOutputStream(outputFilePath);
        try {
            while (fis.available() > 0) {
                fos.write(fis.read());
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
