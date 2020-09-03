package com.cx.day14;

import java.lang.reflect.Field;

public class TestSwap {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a=200,b=200;
        // int --》封装成Integer 类，会产生-128 ～127 默认使用cache缓存（在Integer中有缓存，地址一样 ，则== 地址值一样 ）
        /*
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
         */
        System.out.println(a==b);
        System.out.println("a="+a+" b="+b);
        swap(a,b);
        System.out.println("a="+a+" b="+b);



    }

    static void swap(Integer i1,Integer i2) throws NoSuchFieldException, IllegalAccessException {
        Field field= Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        int temp =i1.intValue();  //这里使用了缓冲数据值，
//        Integer temp = new Integer(i1.intValue());
        // int --》封装成Integer 类，会产生-128 ～127 默认使用cache缓存（在Integer中有缓存，地址一样）

        field.set(i1,i2.intValue());   //会自动封装（object对象参数）：   Integer.valueOf(i2.value()).intValue();  i2.value:int->Integer.valueOf:Integer->intValue:int
        field.set(i2,temp);

    }
}
