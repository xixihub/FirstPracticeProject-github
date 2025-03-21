package com.zz.student.sockit_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author zz
 * @version 1.0
 * @Description TCP 文件客户端，向服务器发送图片文件并接收确认消息。
 */
public class TcpSocketFileClient {
    // 服务器地址和端口
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8888;
    // 本地图片文件路径
    private static final String IMAGE_PATH = "D:\\myfile\\image.jpg";

    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getByName(SERVER_ADDRESS), SERVER_PORT);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
             BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(IMAGE_PATH));
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("已连接到服务器");

            // 读取本地图片文件并发送到服务器
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.println("客户端发送消息");
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }
            bufferedOutputStream.flush();
            System.out.println("图片发送完成");

            // 通知服务器数据发送完毕
            socket.shutdownOutput();

            // 读取服务器的确认消息
            String response = bufferedReader.readLine();
            System.out.println("客户端接收消息：" + response);
        } catch (IOException e) {
            System.err.println("客户端运行失败: " + e.getMessage());
        }
    }
}