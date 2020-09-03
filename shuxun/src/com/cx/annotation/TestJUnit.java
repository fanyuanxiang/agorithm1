package com.cx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestJUnit {


    //模拟JUnit方法的标记使用，被标记的方法就可以被低调用执行，

    @MyTest
    public void method1(){
        System.out.println("=========method1=========");
    }

    public void method2(){
        System.out.println("=========method2=========");
    }
    @MyTest
    public void method3(){
        System.out.println("=========method3=========");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestJUnit testJUnit = new TestJUnit();
        Class<? extends TestJUnit> aClass = testJUnit.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method m :
                methods) {
            if (m.isAnnotationPresent(MyTest.class)){
           m.invoke(testJUnit);
            }
        }
    }




}




@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTest{ }

