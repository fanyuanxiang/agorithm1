package com.cx.day05;

public class Manager extends Employee2 {
    public Manager(int no, String name, int salary,int found) {
        super(no, name, salary);
        this.found=found;
    }
    public void talk(){
        System.out.println("I am talking ...");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "redPacket=" + found +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
