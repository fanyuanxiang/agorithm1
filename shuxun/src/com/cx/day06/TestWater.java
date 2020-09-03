package com.cx.day06;

public class TestWater {
    public static void main(String[] args) {

        Water1 water1 = new Water1();
        water1.water();
        water1.filter();
        Water2 water2 = new Water2();
        water2.water();
        water2.buffer();
        Water3 water3 = new Water3();
        water3.water();
        water3.addSugar();
        water3.heating();

    }

}
