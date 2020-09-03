package com.cx.day05.MainPackage;

import com.cx.day05.CarOfAuto;

public class TestCarOfAuto {
    public static void main(String[] args) {
        CarOfAuto car = new CarOfAuto(true,true);
        System.out.println(car.toString());
        car.speedUp();
        car.stop();
        System.out.println(car.toString());
        CarOfAuto car2 = new CarOfAuto("red", 30, true, true);
        System.out.println(car2.toString());
        car2.speedUp();
        car.speedDown();
    }
}
