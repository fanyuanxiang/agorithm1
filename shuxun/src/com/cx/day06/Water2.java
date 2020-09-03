package com.cx.day06;

public class Water2 extends Water implements Buffer {
    @Override
    public void buffer() {
        System.out.println("水经过了缓冲。。。");
    }

    @Override
    public void water() {
        System.out.println("water2");
    }
}
