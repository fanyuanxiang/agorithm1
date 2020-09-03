package com.cx.jvm;

/**
 * @program: shuxun
 * @description: 线程死锁
 * @author: Chiry
 * @create: 2020-09-01 17:05
 *
 **/
class  A {};
class  B {};
public class ThreadDeadLocal {
    static  A a=new A();
    static B b=new B();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.print("我获得了a 和b");
                    }
                }
            }
        },"thread1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    synchronized (a){
                        System.out.println("我获得了a和b");
                    }
                }
            }
        },"thread2").start();
    }
}


