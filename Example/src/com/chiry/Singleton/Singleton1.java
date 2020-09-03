package com.chiry.Singleton;

import java.io.Serializable;

public class Singleton1 implements Serializable {
    //饿汉式单列对象（会在一开始类加载就会创建对象数据）

    //对于多线程式安全的。
    //对反序列化要加方法才能保证单例对象(因为序列化对象不会序列化静态构造方法)
    //对反射无法保证单一对象



    private static Singleton1 instance=new Singleton1();
    private Singleton1(){
        System.out.println("singleton1  load");
    };
    public static Singleton1 getSingleton1(){
        return  instance;
    }
    public Object readResolve(){  //反序列化不安全形式
        return instance;
    }


}
