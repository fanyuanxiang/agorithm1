package com.cx.day15;

import java.util.Scanner;

public class TestThread6 {
    // 6.请创建一个线程，指定一个限定时间（如60s），线程运行时，
    // 大约每3s输出1次当前所剩时间，直至给定的限定时间用完。考点：sleep方法
    private static int time =0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("请输入一个线程休息时间：");
        Scanner scanner =new Scanner(System.in);
        time  = scanner.nextInt();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.currentThread().sleep(time * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"mythread").start();
        Thread.yield();
        System.out.println(Thread.currentThread().getName());
        for (int i = time; i > 0; i-=3) {
            System.out.println("线程休息时间还剩"+i);
            Thread.sleep(3000);
        }
    }

}
