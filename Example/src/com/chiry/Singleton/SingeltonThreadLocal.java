package com.chiry.Singleton;

public class SingeltonThreadLocal {

//    private SingeltonThreadLocal instanceThreand = null;
    private static final ThreadLocal<SingeltonThreadLocal> instance = new ThreadLocal<SingeltonThreadLocal>() {
        @Override
        protected SingeltonThreadLocal initialValue() {
            return new SingeltonThreadLocal();
        }
    };

    private SingeltonThreadLocal() {
    }

    public static SingeltonThreadLocal getSingleThread() {
        return instance.get();
    }


}
