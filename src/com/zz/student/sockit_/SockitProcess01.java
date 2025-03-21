package com.zz.student.sockit_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class SockitProcess01 {
    public static void main(String[] args) throws IOException {
        Socket sockit = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = sockit.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write("你好2025");
        bufferedWriter.newLine();
        bufferedWriter.flush();
//        outputStream.write("你好".getBytes());
//        sockit.shutdownOutput();

        InputStream inputStream = sockit.getInputStream();
        byte[] bytes = new byte[1024];
        int readline = 0;
        while ((readline = inputStream.read(bytes)) != -1) {
            System.out.println("客户端收到消息");
            System.out.println(new String(bytes, 0, readline));
        }

        inputStream.close();
        outputStream.close();
        sockit.close();

    }
}
