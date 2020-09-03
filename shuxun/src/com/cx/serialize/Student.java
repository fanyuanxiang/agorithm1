package com.cx.serialize;

import java.io.Serializable;

public class Student  implements Serializable{   //需要序列化（把对象保存到文件中去）的对象必须实现serializable接口（没有任何方法的标记接口），
    //序列化文件版本号，必须是
    private static final long serialVersionUID=2L;

    /*java.io.InvalidClassException: com.cx.serialize.Student; local class incompatible: stream classdesc serialVersionUID = 1,
     local class serialVersionUID = 2
     当类升级版本后，如果序列化后对象没有更新，这会导致反序列失败。
     */

    private String name ;
    private transient int age;



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
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
}
