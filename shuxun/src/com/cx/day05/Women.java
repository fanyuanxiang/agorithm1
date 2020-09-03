package com.cx.day05;

public class Women extends Human{
    private char gender;
    public Women(int age, String name) {
        super(age, name);
        this.gender='女';
    }

    @Override
    public String toString() {
        return "Women{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ",age="+super.getAge()+
                '}';
    }
}
