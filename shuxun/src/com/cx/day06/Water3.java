package com.cx.day06;

public class Water3 extends Water implements AddSugar,Heating {
    @Override
    public void addSugar() {
        System.out.println("加糖水。。。");
    }

    @Override
    public void heating() {
        System.out.println("加热水。。。");

    }

    @Override
    public void water() {
        System.out.println("water3");

    }
}
