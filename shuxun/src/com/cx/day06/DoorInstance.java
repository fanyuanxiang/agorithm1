package com.cx.day06;

public class DoorInstance extends Door {


    @Override
    public void openDoor() {
        System.out.println("开门了。。。。");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门了。。。。");
    }

    public void theftproof(){
        System.out.println("我是个防盗门。");
    }
    public  void waterproof(){
        System.out.println("我是一个防水门。");
    }
    public void bulletproof(){
        System.out.println("我是一个防弹门。");
    }

}
