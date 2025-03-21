package com.zz.student.File_;

import java.io.*;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class InputReadWrit {
    public static void main(String[] args) throws IOException {
 String inputFilePath="D:\\myfile\\myfile1\\1.txt";
 BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath),"UTF-8"));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inputFilePath,true),"UTF-8"));
        bufferedWriter.write("20250226中文");
        bufferedWriter.flush();
        bufferedWriter.close();
        PrintStream out=System.out;
        System.setOut(new PrintStream(inputFilePath));
        System.out.println("哈哈");


    }
}
