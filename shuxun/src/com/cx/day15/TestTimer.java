package com.cx.day15;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {  //schedule(TimerTask task, long delay, long period)
            @Override
            public void run() {
                System.out.println("定时任务，迟延delay 时间2秒（立刻开始），每间隔period 1秒执行一次");
            }
        },2000,1000);
    }
}
