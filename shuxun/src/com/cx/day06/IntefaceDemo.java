package com.cx.day06;

public class IntefaceDemo {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.start(20);
        bus.stop(-50);
        Bike bike = new Bike();
        bike.start(50);
        bike.stop(-49);

    }
}
