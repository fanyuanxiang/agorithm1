package com.cx.day05;

public class Car extends Vehicles {
    int seats;

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }
    public void showCar(){
        System.out.println("Car: "+super.showInfo()+" seats:"+seats);
    }

}
