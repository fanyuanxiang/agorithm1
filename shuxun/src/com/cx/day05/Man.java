package com.cx.day05;

public class Man extends Human{
    char gender;

    public Man(int age ,String name) {
        super(age,name);
        this.gender = '男';
    }

    @Override
    public String toString() {
        return "Man{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ",age="+super.getAge()+
                '}';
    }
}
