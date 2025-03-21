package com.zz.student.sockit_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class SockitProcess {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = null;

        socket = serverSocket.accept();
        System.out.println("有客户端连接");
        InputStream inputStreamReader = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamReader));
        System.out.println("客户端说"+bufferedReader.readLine());
        bufferedReader.close();
        byte[] bytes = new byte[1024];
        int read = 0;
        while ((read = inputStreamReader.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, read));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hell".getBytes());
        socket.shutdownOutput();
        inputStreamReader.close();
        outputStream.close();
        serverSocket.close();
        socket.close();



    }
}
