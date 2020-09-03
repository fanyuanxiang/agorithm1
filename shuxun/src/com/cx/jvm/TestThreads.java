package com.cx.jvm;

/**
 * @program: shuxun
 * @description: 线程诊断定位
 * @author: Chiry
 * @create: 2020-09-01 16:20
 **/
public class TestThreads {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 ........");
                while (true){}
            }
        },"thread1").start();
          new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 ......");
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread2").start();
          new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread3 ......");
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread3").start();
    }
}
