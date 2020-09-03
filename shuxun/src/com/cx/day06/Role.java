package com.cx.day06;
/*
定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
 */
public abstract class Role {
    private String name;
    private int age;
    private char gender;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void play();

    public Role() {
    }

    public Role(String name, int age) {
        this(name,age,' ');
    }

    public Role(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
