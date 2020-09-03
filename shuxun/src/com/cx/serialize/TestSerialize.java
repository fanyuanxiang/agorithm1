package com.cx.serialize;

import org.junit.Test;

import java.io.*;
import java.util.Currency;
import java.util.Properties;

public class TestSerialize {
    @Test
    public void testSerialize() throws IOException {
        Student s1 = new Student("zhangsan", 18);
        //序列化保存对象到文件中必须使用IO

        //高级管道到使用是要把低级管道进行封装到
        FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(s1);
        oos.close();
        System.out.println("序列化文件结束。");

    }
    @Test
    public void testAnte_Sericalize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("student.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student o = (Student) objectInputStream.readObject();
        System.out.println(o.toString());
        System.out.println("反序列化文件成功。");

    }
    @Test
    public void testProperties() throws IOException {

        //Properties 底层就是hashMap，所以可以用map方法去使用该对象
        Properties properties = new Properties();
        properties.setProperty("zhangsan","102000");
        properties.setProperty("lisi","100021");
        System.out.println(properties.getProperty("zhangsan"));
        properties.store(new FileOutputStream("property.properties",true),"this is comments");
        System.out.println("已经把数据存储到文件到中去了");
    }



}
