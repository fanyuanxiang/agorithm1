package com.cx.jvm;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        ExecutorService service2 = Executors.newSingleThreadExecutor();
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"：线程被执行！！！");

            }
        };
        for (int i=0 ;i<5;i++) {
            service.submit(runnable);
        }
        for (int i = 0; i < 5; i++) {
            service2.submit(runnable);
        }

    }

    //service.shutdown();  //执行了线程销毁程序才会停止执行，
}
