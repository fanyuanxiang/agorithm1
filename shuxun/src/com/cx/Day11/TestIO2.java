package com.cx.Day11;

import java.io.File;
import java.util.Scanner;

public class TestIO2 {
    /*
    递归实现输入任意目录，列出文件以及文件夹，效果看图
     */
    public static void main(String[] args) {
        System.out.println("请输入一个地址：");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        gFile(filename);

    }

    public static void gFile(String filename) {

        File f=new File(filename);


        if(!f.isDirectory()){
            System.out.println("这不是一个文件。。");
        }

        {
            File[] fList=f.listFiles();
            for(int j=0;j<fList.length;j++)
            {
                if(fList[j].isDirectory())
                {
                    System.out.println(fList[j].getPath());
                    gFile(fList[j].getPath());
                }
            }
            for(int j=0;j<fList.length;j++)
            {
                if(fList[j].isFile())
                {
                    System.out.println(fList[j].getPath());
                }
            }
        }


    }

}
