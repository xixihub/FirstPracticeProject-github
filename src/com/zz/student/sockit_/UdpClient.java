package com.zz.student.sockit_;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class UdpClient {
    public static void main(String[] args) {
        try(DatagramSocket datagramSocket = new DatagramSocket(9992);){
            byte[] bytes = "你好".getBytes();
            datagramSocket.send(new DatagramPacket(bytes, bytes.length,
                    java.net.InetAddress.getByName("127.0.0.1"),9991));
            byte[] bytesServer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytesServer, bytesServer.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
