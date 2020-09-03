package com.cx.day14;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

public class TestUnsafe {
    private int i ;
    private static Unsafe unsafe=null;
    private static  long I_OFFSET;


    static {


        try {
//        unsafe = unsafe.getUnsafe();  //该类的加载器是使用bootstrap 类加载器加载的，所以该方法getUnsafe()不可以使用

            Field filed = Unsafe.class.getDeclaredField("theUnsafe");
            filed.setAccessible(true);
            unsafe = (Unsafe) filed.get(null);

            I_OFFSET = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("i"));  //内存偏移量
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestUnsafe t1 = new TestUnsafe();
        new Thread(new Runnable() {
            @Override
            public void run() {
               while (true) {
                   boolean b = unsafe.compareAndSwapInt(t1, I_OFFSET, t1.i, t1.i + 1);

                   if (b){
                       System.out.println(Thread.currentThread().getName()+":"+unsafe.getIntVolatile(t1,I_OFFSET));
                   }
                   try {
                       Thread.currentThread().sleep(200);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

               }
            }
        },"th1").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    boolean b = unsafe.compareAndSwapInt(t1, I_OFFSET, t1.i, t1.i + 1);

                    if (b){
                        System.out.println(Thread.currentThread().getName()+":"+unsafe.getIntVolatile(t1,I_OFFSET));
                    }
                    try {
                        Thread.currentThread().sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        },"th2").start();




    }

}
