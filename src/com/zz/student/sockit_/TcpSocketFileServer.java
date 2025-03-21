package com.zz.student.sockit_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zz
 * @version 1.0
 * @Description TCP 文件服务器，接收客户端发送的图片文件并保存到本地。
 */
public class TcpSocketFileServer {
    // 服务器监听的端口号
    private static final int PORT = 8888;
    // 保存图片的路径
    private static final String SAVE_IMAGE_PATH = "src\\2.jpg";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("服务器启动，等待客户端连接...");

            // 接受客户端连接
            try (Socket socket = serverSocket.accept();
                 InputStream inputStream = socket.getInputStream();
                 BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(SAVE_IMAGE_PATH));
                 OutputStream outputStream = socket.getOutputStream();
                 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))) {

                System.out.println("有客户端连接");

                // 读取客户端发送的文件数据并保存到本地
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                    System.out.println("服务端接收消息");
                    bufferedOutputStream.write(buffer, 0, bytesRead);
                }
                bufferedOutputStream.flush();
                System.out.println("图片保存成功：" + SAVE_IMAGE_PATH);

                // 向客户端发送确认消息
                bufferedWriter.write("服务端收到图片");
                bufferedWriter.flush();
                System.out.println("已向客户端发送确认消息");

                // 关闭输出流，通知客户端数据发送完毕
                socket.shutdownOutput();
            } catch (IOException e) {
                System.err.println("客户端连接处理失败: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("服务器启动失败: " + e.getMessage());
        }
    }
}