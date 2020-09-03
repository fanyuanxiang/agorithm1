package com.cx.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestIO_1 {
//    从磁盘读取一个文件到内存中，再打印到控制台
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sum.txt"));
        StringBuilder sb = new StringBuilder();
        String len;
        while((len=br.readLine())!=null){
            sb.append(len);
        }
        System.out.println(sb.toString());

    }
}
