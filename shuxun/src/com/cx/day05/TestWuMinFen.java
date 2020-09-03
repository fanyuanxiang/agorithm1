package com.cx.day05;

public class TestWuMinFen {
    public static void main(String[] args) {

        WuMinFen f1 = new WuMinFen("牛肉", 3, true);
        System.out.println(f1);
        WuMinFen f2 = new WuMinFen("牛肉", 2);
        System.out.println(f2);
        WuMinFen f3 = new WuMinFen("爽辣粉面码", 2, true);
        System.out.println(f3);
    }
}
