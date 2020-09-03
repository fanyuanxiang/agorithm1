package com.cx.jvm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void  meth(){
        System.out.println("我是一个method方法。。。");
        //当调用了15次会生成一个反射调用对象，实现高效反射调用。
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        Method meth = TestReflect.class.getMethod("meth");
        System.in.read();
        for (int i =0;i<=17;i++){
            meth.invoke(null);
            if(i==14){
                System.in.read();
            }
        }

    }
}
