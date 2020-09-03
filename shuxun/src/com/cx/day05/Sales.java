package com.cx.day05;

public class Sales extends Employee2 {
    int found ;
    public Sales(int no, String name, int salary,int found) {
        super(no, name, salary);
        this.found=found;
    }
    public void dance(){
        System.out.println("I am dancing ...");
    }

    @Override
    public String toString() {
        return "Sales{" +
                "found=" + found +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
