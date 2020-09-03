package com.cx.day05.MainPackage;

import com.cx.day05.Human;
import com.cx.day05.Man;
import com.cx.day05.Women;

/*
10、定义类Human，具有若干个属性和功能：定义其子类Man、Woman;在主类Test中分别创建子类、父类和上转型对象，并测试其特性
 */
public class TestHuman {
    public static void main(String[] args) {
        Man man = new Man(18,"zhangsan");
        System.out.println(man.toString());
        Women lisa = new Women(20, "lisa");
        System.out.println(lisa.toString());
        Human human =new Human(30,"lisi");
        Human wanwu=new Man(29,"wanwu");
        System.out.println(wanwu.toString());

    }
}
