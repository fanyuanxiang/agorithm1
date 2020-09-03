package com.cx.day10;

public class RegexVerifyAge {
    public static void main(String[] args) {
        String  age="101";
        String reg="[1-9]|([1-9][0-9])|([1][0-1][0-9])|120";//1-120
        System.out.println(age.matches(reg));
    }
}
