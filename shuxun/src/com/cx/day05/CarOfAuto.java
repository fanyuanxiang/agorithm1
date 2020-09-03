package com.cx.day05;
/*
再定义一个小汽车类Car，继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法
 */
public class CarOfAuto extends Auto {
    boolean air;
    boolean CD;

    public CarOfAuto(boolean air, boolean CD) {
        this.air = air;
        this.CD = CD;
    }

    public CarOfAuto(String color, int speed, boolean air, boolean CD) {
        super(color, speed);
        this.air = air;
        this.CD = CD;
    }

    @Override
    public void speedUp() {
        super.speed+=20;
        System.out.println("Car is speed up :"+speed+"km/h");
    }

    @Override
    public void speedDown() {
        super.speed-=20;
        System.out.println("Car is speed down :"+speed+"km/h");
    }

    @Override
    public String toString() {
        return "Car feature: {" +
                "air=" + air +
                ", CD=" + CD +
                ", tire=" + tire +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
