package com.zz.student.File_;

import java.io.*;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class BuffReadWrit {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFilePath = "D:\\myfile\\myfile1\\1.txt";
        BufferedReader br = new BufferedReader(new FileReader(inputFilePath));

        try {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(inputFilePath, true));
           bw.write("你好");
           bw.newLine();
           bw.write("你好1");
           bw.write("111");
           bw.flush();
           bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
