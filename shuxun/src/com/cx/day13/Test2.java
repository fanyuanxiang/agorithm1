package com.cx.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Test2 {
    //2、已知User类，该类有name(String类型）和age(int类型）两个属性，ArrayList<User>排序，要求按照User对象的age的倒叙排序
    //这里比较类特定属性有Implements Comparable 接口 或Comparator


    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.setAge(29);
        user1.setName("zhangsan");
        user2.setAge(23);
        user2.setName("lisi");
        List users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        Collections.sort(users);
        for (Object u : users) {
        System.out.println(u);
        }
    }
}
