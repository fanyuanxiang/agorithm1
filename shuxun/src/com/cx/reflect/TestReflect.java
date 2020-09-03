package com.cx.reflect;

import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    @Test
    public void testStudent() throws ClassNotFoundException {
        //反射获取字节码对象， Class的对用你反射的对象，

        Class<Student> studentClass = Student.class;  //获取方法1
        System.out.println(studentClass);

        Student s2 = new Student(1, "zhangsan");  //获取方法2
        Class<? extends Student> s2Class = s2.getClass();
        System.out.println(s2Class);
        System.out.println(s2Class.getName());    //返回全限定类名，（包名加类名）
        System.out.println(s2Class.getSimpleName());  //简单类名

        Class<?> s3Class = Class.forName("com.cx.reflect.Student");  //获取方式3，通过Class类的forName（）指定全限定类名方式获取。
        System.out.println(s3Class);
    }

    @Test
    public void testMethod() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class<Student> sclass = Student.class;
        Method[] declaredMethods = sclass.getDeclaredMethods();
        Student student = new Student(18,"zhangsan");
        for (Method m :
                declaredMethods) {
            m.setAccessible(true);
            System.out.println(m.getName()+"===="+m.getParameterCount()+"====="+m.getReturnType());
        }
        Method m1 = sclass.getDeclaredMethod("study");
        m1.invoke(student);
        Method sleep = sclass.getDeclaredMethod("sleep", String.class);
        sleep.setAccessible(true);
        sleep.invoke(student,"zhangsan");

    }
    @Test
    public void saveField() throws IOException, IllegalAccessException {
        Student student = new Student(20,"zhangsan");
        MyBatis.save(student);
    }



}
