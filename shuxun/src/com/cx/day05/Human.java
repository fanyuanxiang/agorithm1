package com.cx.day05;
/*
10、定义类Human，具有若干个属性和功能：定义其子类Man、Woman;在主类Test中分别创建子类、父类和上转型对象，并测试其特性
 */
public class Human {
    private int age ;
    public String name;

    public int getAge() {
        return age;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", name='" + name + '\'' ;
    }
}
