package com.cx.jvm;

import java.util.ArrayList;
import java.util.List;

public class TestStringTableGC {
    public static void main(String[] args) {
        List<String > list= new ArrayList<>();
        int j=0;


        for (int i=0; i<100000; i++){
            list.add(String.valueOf(i).intern());
            j++;
        }
        System.out.println(j);
    }
}
