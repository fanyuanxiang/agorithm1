package com.cx.day05;

/*
、建立一个汽车类，包括轮胎个数，汽车颜色，车身重量等属性。并通过不同的构造方法创建事例。 
	•	  至少要求：汽车能够加速，减速，停车。   
	•	  要求：命名规范，代码体现层次，有友好的操作提示

 */
public class Vehicle2 {
    int tire;
    String color;
    int weight;
    int speed=0;

    public Vehicle2() {
        tire=4;
        color="black";
        weight=2000;

    }

    public Vehicle2(int tire) {
        this();
        this.tire = tire;
    }

    public Vehicle2(int tire, String color) {
        this();
        this.tire = tire;
        this.color = color;
    }

    public Vehicle2(int tire, String color, int weight) {
        this();
        this.tire = tire;
        this.color = color;
        this.weight = weight;
    }


}
