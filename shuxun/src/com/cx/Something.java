package com.cx;

public class Something {
    //constructor method
    Something(){ }
    //
    Something(String something){
        System.out.println(something);
    }
    static String StartWith(String s ){
        return String.valueOf(s.charAt(0));
    }
    String endWith(String s){
        return String.valueOf(s.charAt(s.length()-1));
    }
    void endWith(){
        System.out.println("endwith method");
    }


}
