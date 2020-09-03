package com.cx.day05;
/*
7、构造器的综合使用
	•	1.定义Employee类
	•	    1) 有属性 姓名，年龄  ，名族属性 .分别构建get set方法
	•	    2) 定义一个无参构造器,给几个属性赋默认值.
	•	    3)定义一个对每个属性赋值的构造器.
	•
 */
public class Employee {
    String name ;
    int age ;
    String nation;

    public Employee() {
        name="zhangsan";
        age=18;
        nation="汉族";
    }

    public Employee(String name, int age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' ;
    }
}
