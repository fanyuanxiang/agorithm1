package com.cx.day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    /*
   1、将两个集合{“a”, ”b” , ”c”, ”d”, ”e”}和{“d” ,”e” ,”f” ,”g” ,”h”},把这两个集合去除重复项合并成一个，实现需求
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("集合1的数据：");
        System.out.println(list.toString());
        set.add("d");
        set.add("e");
        set.add("g");
        set.add("h");
        System.out.println("集合2的数据");
        System.out.println(set.toString());

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println("合并去重后的数据：");
        System.out.println(set.toString());


    }

}
