package com.cx.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDome {
    public static void main(String[] args) {
        String i0 = "c";
        String i = "b";
        String i2 = "a";
        List<String> list = new ArrayList<>();
        list.add(i0);
        list.add(i);
        list.add(i2);
        //Collections.sort(list);

        System.out.println(list);
        System.out.println();

        Collections.sort(list,(a,b)-> a.compareTo(b));
        System.out.println(list);


    }




}
