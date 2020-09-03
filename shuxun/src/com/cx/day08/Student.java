package com.cx.day08;

public class Student {
    private int id ;
    private String name ;
    private int age ;
    private int java ;
    private int csharp;
    private int html;
    private int sql;
    private int sum;
    private int avg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getCsharp() {
        return csharp;
    }

    public void setCsharp(int csharp) {
        this.csharp = csharp;
    }

    public int getHtml() {
        return html;
    }

    public void setHtml(int html) {
        this.html = html;
    }

    public int getSql() {
        return sql;
    }

    public void setSql(int sql) {
        this.sql = sql;
    }

    public int getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = java+sql+csharp+html;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = sum/4;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", java=" + java +
                ", csharp=" + csharp +
                ", html=" + html +
                ", sql=" + sql +
                ", sum=" + sum +
                ", avg=" + avg +
                '}';
    }
}
