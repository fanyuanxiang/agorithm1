package com.chiry.Singleton;

public class SingletonDCL {
    private volatile static SingletonDCL instance = null;  //volatile阻止指令重排

    private SingletonDCL() {
    }

    public static SingletonDCL getSingletonInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if(instance==null) {        //双重检测，
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
