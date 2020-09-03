package com.cx.day05;
/*
8、建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等成员变量。并通过不同的构造方法创建实例。
	•	至少要求：  汽车能够加速，减速，停车。
	再定义一个小汽车类Car，继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法
 */
public class Auto {
    int tire;
    String color ;
    int weight;
    int speed;

    public Auto() {
        tire =4;
        color="black";
        weight=2000;
        speed=0;
    }

    public Auto(String color, int speed) {
        this();
        this.color = color;
        this.speed = speed;
    }
    public void speedUp(){
        speed+=10;
        System.out.println("speed:"+speed+"km/h");
    }
    public void speedDown(){
        speed-=10;
        System.out.println("speed:"+speed+"km/h");
    }
    public void stop(){
        speed=0;
        System.out.println("停车 ，speed:"+speed+"km/h");
    }


}
