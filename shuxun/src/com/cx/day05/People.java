package com.cx.day05;
/*
People类是Monkey类的子类，在People类中重写方法speak(),在speak方法中输出“小样的，不错嘛，会说话了！”的信息
	•	在People类中新增方法void think(),在think方法输出“别说话，认真思考”的信息
	•	在主类Main方法创建Monkey和People类的对象测这两个类的功能
 */

public class People extends Monkey {


    public People(String s) {
        super(s);

    }
    public void name(){
        String s = super.s;
        System.out.println("我的名字是："+s);
    }
    public void think(){
        System.out.println("别说话，认真思考。");
    }
}
