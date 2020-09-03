package com.chiry.Singleton;

import com.sun.xml.internal.ws.server.ServerRtException;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: shuxun
 * @description: 第一个重复出现的字符串重复出现字符串
 * @author: Chiry
 * @create: 2020-08-31 17:16
 **/
public class RepeatChar {
    public static void main(String[] args) {
        String str = "abcdeeabc";
        Set<Character> ch = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!ch.add(str.charAt(i))) {
                System.out.println("第一次重读出现的字符！");
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    @Test
    public void test1(){
        String str = "abcdeeabc";
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            if(hm.containsKey(str.charAt(i))){
                Integer integer = hm.get(str.charAt(i));
                count = integer.intValue();
                hm.put(str.charAt(i),++count);

            }else {
                hm.put(str.charAt(i),1);
            }
        }
        System.out.println(hm);
    }
    @Test
    public void test2(){
        String str = "abcdeabc";
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            if(hm.containsKey(str.charAt(i))){
                Integer integer = hm.get(str.charAt(i));
                count = integer.intValue();
                hm.put(str.charAt(i),++count);
                System.out.println("第一次出现重读字符！"+str.charAt(i));
                break;
            }else {
                hm.put(str.charAt(i),1);
            }
        }
        System.out.println(hm);
    }

    /**
    * @Description: 只出现一次的字符并且是第一次出现的
    * @Param: []
    * @return: void
    * @Author: Chiry
    * @Date: 2020/8/31
    */
    @Test
    public void test3(){
        String str="abcdefghijklmnobc";
        Map<Character,Integer> map=new HashMap<Character,Integer>();

        for (int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                Integer count = map.get(str.charAt(i));
                int i1 = count.intValue();
                i1++;
                map.put(str.charAt(i),i1);

            }else {
                map.put(str.charAt(i),1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==1){
                System.out.println("第一个出现一次的字符："+str.charAt(i));
                break;
            }
        }
        System.out.println(map);

    }
    @Test

    public void test3_1(){
        String str="abcdefghijklmnacb";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

}
