package com.cx.day15;

import java.net.URL;

public class Test {


    public static void main(String[] args) {
        int i = 3;
        System.out.println(-8 >> 1);
        int a = 1;
        int b = 2;


        System.out.println((a >> 31) ^ (b >> 31));//判断两个字符的正负是否相等
        //^ XOR 异或相同为0，相异为1；
        Class<Test> testClass = Test.class;
        System.out.println(testClass);
        URL test = testClass.getClassLoader().getResource("com/cx/day15/Test");
        System.out.println(test);
        System.out.println(testClass.getClassLoader());
        System.out.println(testClass.getClassLoader().getParent());
        System.out.println(testClass.getClassLoader().getParent().getParent());

        System.out.println(ClassLoader.getSystemClassLoader());//系统类加载器  AppClassLoader
        System.out.println(ClassLoader.getSystemClassLoader().getParent());//ExtClassLoader 在jad9以后是Platform 类加载器
        while (true) {
        }

    }
}
