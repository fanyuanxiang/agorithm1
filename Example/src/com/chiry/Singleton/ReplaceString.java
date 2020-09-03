package com.chiry.Singleton;

import java.io.*;
import java.nio.Buffer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ReplaceString {
    public static void main(String[] args) throws IOException {
        String s1="How are you";
        String s = s1.replaceAll(" ", "%20");
        System.out.println(s);

        StringBuffer s2 = new StringBuffer(s1);
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
     String str;
        while((str = bf.readLine())!= null){
        System.out.println(str.replaceAll(" ","%20"));
    }
    }



}

