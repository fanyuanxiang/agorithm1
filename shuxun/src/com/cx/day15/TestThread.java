package com.cx.day15;

public class TestThread {
    /*
    1.编写一个多线程类，该类的构造方法调用Thread类带字符串参数的构造方法。建立自己的线程名，
    然后随机生成一个休眠时间，再将自己的线程名和休眠多长时间显示出来。该线程运行后，休眠一段时间，
    该时间就是在构造方法中生成的时间。最后编写一个测试类，创建多个不同名字的线程，并测试其运行情况。 
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThread1("thread"+i).start();
        }
    }

}
