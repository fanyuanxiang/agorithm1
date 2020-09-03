package com.cx.day06;
/*
支持多线程的单例，
防止指令的重排序
 */

public class Singleton {
    private static volatile Singleton INSTANCE;
    private Singleton(){};
    public static Singleton getINSTANCE(){
        if (INSTANCE==null){
            //DCL双重检测
            synchronized(Singleton.class){
                try{
                Thread.sleep(1);//给一个线程等待避免多线程高并发出先冲突
                    }catch (InterruptedException e){
                e.printStackTrace();
                }

                if(INSTANCE==null) {
                    INSTANCE = new Singleton();
                }
            }

        }
            return INSTANCE;


    }
    public void m(){
        System.out.println("m 方法。");
    }

    public static void main(String[] args) {
        for (int i=0 ;i<100;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+":"+Singleton.getINSTANCE().hashCode());
            } ).start();
        }
    }
}
