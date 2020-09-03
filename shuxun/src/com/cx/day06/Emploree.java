package com.cx.day06;

public class Emploree extends Role{
    int ID;
    int salary;

    public Emploree(int ID, int salary) {
        this.ID = ID;
        this.salary = salary;
    }

    public Emploree(String name, int age, int ID, int salary) {
        super(name, age);
        this.ID = ID;
        this.salary = salary;
    }

    public Emploree(String name, int age, char gender, int ID, int salary) {
        super(name, age, gender);
        this.ID = ID;
        this.salary = salary;
    }

    public final void sing(){
        System.out.println("我正在唱歌。。。");
    }

    @Override
    public String toString() {
        return "Emploree{" +
                "ID=" + ID +
                ", name=" + super.getName() +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void play() {

    }
}
