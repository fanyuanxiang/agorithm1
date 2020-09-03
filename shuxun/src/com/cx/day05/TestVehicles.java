package com.cx.day05;

public class TestVehicles {
    public static void main(String[] args) {
        Car car =new Car("bmw","red",5);
        car.showCar();

        Truck truck=new Truck("benzi","blue",900);
        truck.showTruck();
    }
}
