package com.cx.net;

import java.io.IOException;
import java.net.*;

public class UDP_client {
    public static void main(String[] args) throws IOException {
        byte[] bytes = "你好！！哈，".getBytes();
        //1. 创建数据发送包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);

        //2.创建数据的发送数据端。
        DatagramSocket datagramSocket = new DatagramSocket(7777);

        //3.发送数据
        datagramSocket.send(datagramPacket);
        datagramSocket.close();





    }
}
