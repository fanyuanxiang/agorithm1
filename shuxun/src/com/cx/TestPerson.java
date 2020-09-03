package com.cx;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("zhangsan",18);
        Person person1 = new Person();
        person.display();
        person1.display();
    }
}
