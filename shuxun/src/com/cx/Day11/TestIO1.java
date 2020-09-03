package com.cx.Day11;

import java.io.File;
import java.io.IOException;

/*
在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，
在创建一个目录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
 */
public class TestIO1 {
    public static void main(String[] args) throws IOException {
        File file = new File("HelloWorld.txt");
        if(file.exists()){
        }else {
            file.createNewFile();
        }
        if(file.isFile()){
            System.out.println(file.getName()+"这是一个文件");
        }else {
            System.out.println(file.getName()+"这是一个文件夹");
        }
        File dir = new File("IOTest");
        dir.mkdir();
        //文件移动
        file.renameTo(new File(dir.getName() + File.separator + file.getName()));
        String[] list = dir.list();
        System.out.println(dir.getName()+"文件夹下有文件：");
        for (String s :
                list) {
            System.out.println(s);
        }


    }
}
