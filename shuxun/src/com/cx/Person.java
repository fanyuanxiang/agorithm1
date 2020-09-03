package com.cx;

public class Person {
    private String name;
    private int age ;
    public Person(){
        this("default",0);
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("name:"+name+"age:"+age);
    }
}
