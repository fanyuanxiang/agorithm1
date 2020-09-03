package com.chiry.Singleton;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
    @Test
    public void testSingleton(){
        Singleton1 singleton1 = Singleton1.getSingleton1();
        Singleton1 singleton2 = Singleton1.getSingleton1();
        System.out.println(singleton1==singleton2);
    }

    @Test
    public void testSingletonOfThread(){
        for (int i = 0; i < 20; i++) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton1.getSingleton1());
            }
        }).start();
        }
    }

    @Test
    public void testSingleOfSerializable() throws ClassNotFoundException {
        //

        Singleton1 s1 = Singleton1.getSingleton1();
        SerializeUtil.serialize(s1);
        Singleton1 s2 =(Singleton1) SerializeUtil.unserialize();
        System.out.println(s1==s2);
    }

    @Test
    public void testSingletonOfReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Singleton1> singleton1Class = Singleton1.class;

        Constructor<Singleton1> declaredConstructor = singleton1Class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton1 s2 = declaredConstructor.newInstance();

        Singleton1 s1 = Singleton1.getSingleton1();
        System.out.println(s1==s2);

    }




    @Test
    public void testSingleton2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton2 s1 = Singleton2.getInstance();
        Class<Singleton2> clazz = Singleton2.class;
        Constructor<Singleton2> declaredConstructor = clazz.getDeclaredConstructor();
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);
        Singleton2 s2 = declaredConstructor.newInstance();  //阻止反射创建对象。
        System.out.println(s1==s2);
    }


    @Test
    public void testSerialize() throws ClassNotFoundException {
        Singleton2 instance = Singleton2.getInstance();
        System.out.println(instance);
        SerializeUtil.serialize(instance);
        Singleton2 i2 = (Singleton2) SerializeUtil.unserialize();
        System.out.println(i2==instance);
    }
    @Test
    public void testSingleInstanceDCL() throws InterruptedException {
        SingletonDCL s1 = SingletonDCL.getSingletonInstance();
        SingletonDCL s2 = SingletonDCL.getSingletonInstance();
        System.out.println(s1==s2);
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(SingletonDCL.getSingletonInstance())).start();
        }

    }
    @Test
    public void testSIngleInstanceThreadLocal() throws FileNotFoundException {

//        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName() + " : " + SingeltonThreadLocal.getSingleThread()));
//        thread.start();
        SingeltonThreadLocal s1 = SingeltonThreadLocal.getSingleThread();
        SingeltonThreadLocal s2 = SingeltonThreadLocal.getSingleThread();
        System.out.println(s1==s2);
        //在每个线程，
    }
}
