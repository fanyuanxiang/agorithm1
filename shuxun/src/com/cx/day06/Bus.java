package com.cx.day06;

public class Bus implements Vehicle {
    @Override
    public void start(int speed) {
        System.out.println(speed+"km/h 启动车子。。。(bus)");
    }

    @Override
    public void stop(int  speed) {
        System.out.println(speed+"km/h 减速停车。。。(bus)");
    }
}
