package com.cx.day13;

import java.util.Comparator;
import java.util.Objects;

public class User  implements Comparable<User>{
    private String name ;
    private int age ;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    @Override
    public int compareTo(User o) {
        return this.age-o.age;
    }
}
