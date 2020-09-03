package com.cx.Day11;

import java.io.File;
import java.util.Scanner;

public class TestIO3 {
    /*
    递归实现列出当前工程下所有.java文件
     */
    public static void main(String[] args) {
        System.out.println("请输入一个地址：");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        gJavaFile(filename);
    }

    public static void gJavaFile(String directory) {

        File f = new File(directory);


        if (!f.isDirectory()) {
            System.out.println("这不是一个文件。。");
        } else {
            File[] fList = f.listFiles();
            for (int j = 0; j < fList.length; j++) {
                if (fList[j].isDirectory()) {
                    gJavaFile(fList[j].getPath());
                }
            }
            for (int j = 0; j < fList.length; j++) {
                if (fList[j].isFile()) {
                    if (fList[j].getPath().endsWith(".java"))
                    System.out.println(fList[j].getPath());

                }
            }
        }
    }
}
