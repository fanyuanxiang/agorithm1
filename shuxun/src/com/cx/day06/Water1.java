package com.cx.day06;

public class Water1 extends Water implements Filter{
    @Override
    public void filter() {
        System.out.println("水已经经过过滤了。。。");
    }

    @Override
    public void water() {
        System.out.println("water1...");
    }

}
