package com.zz.student.sockit_;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author zz
 * @version 1.0
 * @Description UDP服务接受数据
 */
public class UdpServer {
    public static void main(String[] args) {
        try (DatagramSocket datagramSocket = new DatagramSocket(9991);) {
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
            if (datagramPacket.getLength() > 0) {
                byte[] bytesclient = "收到".getBytes();
                datagramSocket.send(
                        new DatagramPacket(bytesclient, bytesclient.length, datagramPacket.getAddress(), datagramPacket.getPort()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
