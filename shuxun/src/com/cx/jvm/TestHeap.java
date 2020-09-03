package com.cx.jvm;

public class TestHeap {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1....");
        Thread.sleep(10000);
        byte[] arr=new byte[10*1024*1024];//10 MB
        System.out.println("2....");
        Thread.sleep(30000);
        arr=null;
        System.gc();
        System.out.println("3......");
        Thread.sleep(20000);
        System.out.println("线程结束");

    }
}