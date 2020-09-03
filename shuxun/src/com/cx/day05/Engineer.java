package com.cx.day05;

public class Engineer extends Employee2{
    public Engineer(int no, String name, int salary,int found) {
        super(no, name, salary);
        this.found=found;
    }
    public void sing(){
        System.out.println("I am singing ....");

    }

    @Override
    public String toString() {
        return "Engineer{" +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", found=" + found +
                '}';
    }
}
