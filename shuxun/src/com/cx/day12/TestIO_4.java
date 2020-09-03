package com.cx.day12;


import java.io.IOException;
import java.io.RandomAccessFile;

public class TestIO_4 {
    /*
    使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("Hello.txt", "r");
        StringBuffer bf = new StringBuffer();
        long length = randomAccessFile.length();
        while (length > 0) {
            length--;
            randomAccessFile.seek(length);//定位文件读取位置点position
            char c = (char) randomAccessFile.readByte();
            if (c >= 0 && c <= 255) {
                bf.append(c);
            } else {//不在0-255则不是英文字符 中文字符在非utf-8下是两个字节
                byte[] bytes = new byte[3];
                length-=2;
                randomAccessFile.seek(length);
                randomAccessFile.readFully(bytes);//readFully() : bytes the buffer which the data is read
                //bytes= byte [3] 占据三个字节点utf-8 编码
                bf.append(new String(bytes,"utf-8"));//这里要注意文件是开始点编码格式。解析bytes时候也要注意把文件格式相应指定解码打印
            }
        }
        System.out.println(bf);
        randomAccessFile.close();


    }
}
