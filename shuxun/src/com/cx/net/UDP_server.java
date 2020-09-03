package com.cx.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class UDP_server {
    public static void main(String[] args) throws IOException {

        System.out.println("=======server=====");

        //1。创建接收数据集装箱
        //2。UDP传输数据大小限制是64k
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes,bytes.length);

        //3。创建数据的接收端口
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        datagramSocket.receive(datagramPacket1);


        //接受到到数据放在集装箱到数组中
        String s = new String(bytes,0,datagramPacket1.getLength());//指定的数据包，接收到的长度
        System.out.println(s);

    }
}
