package com.cx.day12;

import java.io.*;

public class TestIO_2 {
    /*
    在程序中写一个"HelloJavaWorld你好世界"输出到操作系统文件Hello.txt文件中
     */
    public static void main(String[] args) throws IOException {

        BufferedWriter bf = new BufferedWriter(new FileWriter("Hello.txt"));
        String str ="HelloJavaWorld你好世界";
        bf.write(str);
        bf.close();

    }
}
