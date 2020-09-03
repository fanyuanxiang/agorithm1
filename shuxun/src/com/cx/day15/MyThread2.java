package com.cx.day15;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread2 extends Thread {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd  hh:mm:ss");
    @Override
    public void run() {
        while (true){
            String str =simpleDateFormat.format(new Date());//获取当前时间
            System.out.println(str);
            try {
                Thread.currentThread().sleep(1000);//休眠时间1秒中达到时间计时效果
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
