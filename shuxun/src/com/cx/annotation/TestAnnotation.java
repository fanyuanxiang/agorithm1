package com.cx.annotation;

//1。注解定义带属性必须初始化赋值，属性必须带小括号
//2。如果注解类中只有一个属性时候，定义value 属性，value属性在初始化的时候可以省略不写

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyBook(name= "zhangsan",authors = {"pozai","lisi"},price = 18)
public class TestAnnotation {
    private int age ;
    @Mytest
    public void testRun(){

    }


    @Test
    public void testAnnotation(){//解析类的上的注解，
        //1,获取类的上的注解，先获取类Class对象
        Class<TestAnnotation> aClass = TestAnnotation.class;
        //2。判断是否存在注解对象
        if (aClass.isAnnotationPresent(MyBook.class)){
            //获取这个注解对象
            MyBook mybook = aClass.getDeclaredAnnotation(MyBook.class);
            System.out.println(mybook.name());
            System.out.println(mybook.price());
            System.out.println(mybook.authors());
        }
        System.out.println("null");


    }

}

//自定义注解

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})

@interface MyBook{
    String name();  //注解里面称之为属性（类中是成员变量），并且带一个括号，因可当作方法调用
    String[] authors();
    double price();
    String address = "广州";// default "广州"   ==等价
        }

        //元注解：注解注解的注解

@Target({ElementType.FIELD,ElementType.METHOD})//指定注解的注解对象
@Retention(RetentionPolicy.RUNTIME)  //说明注解的生存时期
@interface  Mytest{


}