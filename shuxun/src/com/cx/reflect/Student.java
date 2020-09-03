package com.cx.reflect;

public class Student {
    int age ;
 public String name;
    private Student(){
        System.out.println("无参构造方法。。。");
    }
    public Student(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("有参构造方法。。。");
    }

    public void study(){
        System.out.println("我正在学习。。");
    }
    private void sleep(String name ){
        System.out.println(name+"正在睡觉。。");

    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
