package com.cx.day05;

public class Truck extends Vehicles {
    int load;

    public Truck(String brand, String color, int load) {
        super(brand, color);
        this.load = load;
    }
    public void showTruck(){
        System.out.println("Truck: "+super.showInfo()+" seats:"+load+" kg");
    }
    
}
