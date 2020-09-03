package com.cx.day15;


import java.util.Random;

//4.应用继承类Thread的方法实现多线程类，该线程3次休眠若干(随机)毫秒后显示线程名和第几次执行。 
public class MyThread4 extends Thread {
    private int t=1;

    public MyThread4(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
        Random random = new Random();
         int time =(random.nextInt(10))*100;
            try {
                Thread.currentThread().sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName()+":休眠时间"+time+"该线程第："+t+"执行");
            t++;
        }
    }
}
