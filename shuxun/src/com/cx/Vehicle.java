package com.cx;

public class Vehicle {
    int speed;
    int size;
   public void move(){
       System.out.println("车值移动了。。。");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int s){
       this.speed=s;
    }
    public void speedUp(){
       speed++;
       System.out.println("加速了："+speed);
    }
    public void speedDown(){
       speed--;
        System.out.println("减速了："+speed);
    }
}
