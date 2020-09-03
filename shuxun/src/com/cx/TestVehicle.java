package com.cx;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSize(100);
        vehicle.setSpeed(80);
        System.out.println("车子的尺度是："+vehicle.size+"  速度为："+vehicle.speed);
        vehicle.speedUp();

    }
}
