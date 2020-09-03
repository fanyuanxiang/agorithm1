package com.cx.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class APIStream {
    public static void main(String[] args) {

        //Stream流API的使用
        String[] names  = new String[]{"张三", "李四", "王五", "赵无极"};
        Stream<String> stream = Arrays.stream(names);
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        Stream<String> stream1 = Arrays.stream(names);

        //使用lambda和方法引用进行简化
        stream1.filter((s)->{
            return s.startsWith("张");
        }).forEach((s)->{
            System.out.println(s);
        });

        //这里注意stream流只能使用一次就会失效，关闭
        Stream<String> stream2 = Arrays.stream(names);
        stream2.filter(s-> s.startsWith("张")).forEach(System.out::println);//(s)->System.out.println(s);  方法引用的方式

    }
}
