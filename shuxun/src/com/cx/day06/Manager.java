package com.cx.day06;

public class Manager extends Emploree {
    final String vehicle="car";

    public String getVehicle() {
        return vehicle;
    }

    public Manager(String name, int age, char gender, int ID, int salary) {
        super(name, age, gender, ID, salary);
    }

}
