package com.cx.day10;

public class RegexMobil {
    public static void main(String[] args) {
        String tel="15179392912";
        String reg ="(\\d{3})(\\d{4})(\\d{4})";//xx.replace(/(.{3})(.*)(.{4})/, '$1******$2')
        if(tel.matches(reg))
        System.out.println(tel.replaceAll(reg,"$1****$3"));
        else
            System.out.println("不是字电话号码。。");
    }
}
