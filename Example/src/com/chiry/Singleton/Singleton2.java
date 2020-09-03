package com.chiry.Singleton;

import java.io.Serializable;

public class Singleton2 implements Serializable {

    private static class  SingleInner  {
        private static Singleton2  ingtance= new Singleton2();
    }
    private Singleton2(){
        System.out.println("singleton2 load");
        if(SingleInner.ingtance!=null){
            throw new IllegalStateException();
        }

    };
    public static Singleton2 getInstance(){
        return SingleInner.ingtance;
    }


    //反序列化不安全 可以使用readResolve去解决（因为序列化不会去保存构造方法）
    private Object readResolve(){
        return SingleInner.ingtance;

    }



}
