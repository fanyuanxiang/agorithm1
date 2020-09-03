package com.cx.day08;

import java.util.concurrent.TimeUnit;

public class TestVolatile {
   volatile  boolean running =true ;
    void m(){
        System.out.println("m start");
        while(running ){

        }
        System.out.println("m end");
    }


    public static void main(String[] args) {
        TestVolatile testVolatile = new TestVolatile();
        Thread thread = new Thread(testVolatile::m);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testVolatile.running=false;
    }


}
