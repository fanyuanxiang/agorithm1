package com.cx.reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyBatis {
    public static  void save(Object o) throws IllegalAccessException, IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream("b.txt");) {//jdk1.7 在try小括号中可以字节释放资源

            Class<?> clazz = o.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field f :
                    fields) {
                String name = f.getName();
                String value =  f.get(o)+"" ;//拿到成员变量对象，并且指定对象使用该变量赋值
                String item = value + "===" + name;
                fileOutputStream.write(item.getBytes());
                fileOutputStream.write("\r".getBytes());
            }
        }
    }
}
