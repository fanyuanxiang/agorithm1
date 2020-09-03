package com.cx.day15;

public class TestThread5 {
    //5.请通过实现Runnable接口和继承Thread类分别创建线程，
    // 要求：除了main线程之外，还要创建一个新的线程。Main线程重复100次“main“，新线程重复100次输出“new”。 
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"new ");
                }
            }
        },"myThread").start();

        for (int i = 0; i < 100; i++) {
            System.out.println("mainThread:main");

        }
    }
}
