package com.cx.jvm;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {
    private static  AtomicInteger i=new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                i.getAndIncrement();   //i++
//                i.incrementAndGet();   //++i
            }
        },"t2");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                i.decrementAndGet();

            }
        },"t1");
        t2.start();
        t1.start();

        t1.join();  //暂定主线运行，等待t1线程执行完毕再执行主线程
        t2.join();
        System.out.println(i);

    }

}
