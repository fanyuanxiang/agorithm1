package com.cx;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(19,50,39);
        myTime.display();
        myTime.addSecond(30);
        myTime.display();
        myTime.subMinute(60);
        myTime.display();
    }
}
