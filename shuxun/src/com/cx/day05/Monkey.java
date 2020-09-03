package com.cx.day05;
/*
Monkey类中有个构造方法，Monkey（String s），并且有个public void speak()方法
	•	在speak方法中输出“咿咿呀呀。。。”的信息
 */
public class Monkey {
    String s;
    public Monkey(String s ){
        this.s=s;
    }
    public void speak(){
        System.out.println("咿咿呀呀。。。");
    }
}
