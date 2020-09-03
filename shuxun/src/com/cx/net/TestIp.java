package com.cx.net;

import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIp {
    @Test
    public void testInetAddress() throws IOException {
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getAllByName("localhost")[1]);
        InetAddress ip1 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip1.getHostAddress());
        System.out.println(ip1.getHostName());

        boolean reachable = ip1.isReachable(1000);//ping 命令，1秒内操作ping尝试
        System.out.println(reachable);
        System.out.println(InetAddress.getLocalHost().isReachable(1000));

    }
}
