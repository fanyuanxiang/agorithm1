package com.cx.day15;

public class TestThread3 {
    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();
        testThread3.new Thread3("mythread",10000).start();

        new TestThread3().new Thread3("mythread2",2000).start();


    }

    class Thread3 extends Thread{
        private  int time ;
        private String name ;


        public Thread3(String name ,int time) {
            super(name);
            this.time=time ;
        }

        @Override
        public void run( ) {
            try {
                System.out.println(Thread.currentThread().getName()+"线程休眠时间:"+time +"millis");
                Thread.currentThread().sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
