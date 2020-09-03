package com.cx.day06;

public class TestRole {
    public static void main(String[] args) {
        Emploree emploree = new Emploree("zhangsan",18,'男',112,5000);
        System.out.println(emploree.toString());
        emploree.sing();
        Manager manager = new Manager("Lisa",20,'女',113,5000);
        manager.getVehicle();
    }
}
