package com.chiry.Singleton;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharMaxTimes {
    @Test
    public void test1() {
        String str = "abcdefaaabbcccc";
        char res = str.charAt(0);
        int max = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if(map.containsKey(temp)){
                count=map.get(temp)+1;
            }else {
                count=1;
            }
            map.put(temp,count);

            if(count>max){
                res=temp;
                max=count;
            }

        }

        System.out.println("字符串:"+str+"最长的字符"+res+":"+max);
        Set<Character> characters = map.keySet();
        for (Character c: characters
             ) {
            System.out.println(c+":"+map.get(c));
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character,Integer> enty: entries
             ) {
            System.out.println(enty);

        }
    }





}
