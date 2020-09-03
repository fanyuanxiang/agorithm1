package com.cx;

public class SomeThingDemo {
    public static void main(String[] args) {
        IConvert<String, String> startWith = Something::StartWith;
        String convert = startWith.convert("123");
        System.out.println(convert);
//        Something something=new Something();
//        IConvert<String,String> con=something::endWith;
//        something.endWith();
    }
}
