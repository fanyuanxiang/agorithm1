package com.cx;

public class Boy {
    private String name;
    private int age ;

     Boy(){
        this("fanxiang");
    }
    public Boy(String name){
        this.name=name;
    }
    public Boy(String name ,int age){
        this(name);
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl){
        String name = girl.getName();
        System.out.println("marry to "+name);

    }
    public void shout(){
        String s = "this is shout method!";
        System.out.println(s);
    }
}