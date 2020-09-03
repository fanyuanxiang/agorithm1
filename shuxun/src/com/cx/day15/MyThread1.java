package com.cx.day15;

import java.util.Random;

public class MyThread1 extends Thread{

    public MyThread1(String t) {
        super(t);
    }

    @Override
    public void run() {
        Random random = new Random();
        int time = random.nextInt(100);
        try {
            System.out.println(Thread.currentThread().getName()+"休眠时间:"+time+"millis");
            Thread.currentThread().sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
