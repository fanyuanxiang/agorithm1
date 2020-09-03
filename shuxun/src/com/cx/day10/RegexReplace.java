package com.cx.day10;

public class RegexReplace {
    public static void main(String[] args) {
        String   s = "我我...要.....学..学编...程程..........";
        System.out.println(s);
         s= s.replaceAll("\\.+", "");
        System.out.println(s);
        s= s.replaceAll("(.)\\1+", "$1"); // $1：表示第一个括号的表达式， \1 表示前一个括号内匹配的内容
        System.out.println(s);



    }
}
