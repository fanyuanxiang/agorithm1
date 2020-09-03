package com.cx.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        String regex="[a-zA-Z_0-9]+@[a-zA-Z_0-9]+\\.[a-zA-Z]+";
        String email = "fyxdds@icloud..com";
//        Pattern compile = Pattern.compile(regex);
//        Matcher matcher = compile.matcher(email);
        boolean matc = email.matches(regex);
        System.out.println(matc);
        if(matc){
            System.out.println(email);
            System.out.println("....这是一个正确的");
        }else {

            System.out.println("这个不是正确的邮箱格式！！");
        }
    }
}
