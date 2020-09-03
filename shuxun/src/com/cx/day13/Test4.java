package com.cx.day13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {
    //5、用List方法，存储10个 1-50（含50)的随机偶数元素，要求数字不能重复，
    // 添加完成后从大到小倒叙输出到控制台并使用IO流将集合中的元素按指定格式输出到当前项目的num.txt ,例如 48,44,40,38,34,30,26...
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int su;
        for (int i = 0; i < 10; i++) {
        su = random.nextInt(26)*2;
        integers.add(su);
          }
        Collections.sort(integers);
        BufferedWriter bw = new BufferedWriter(new FileWriter("num.txt"));
        for (int i = integers.size()-1; i>=0;i--) {
            System.out.println(integers.get(i));
            bw.write(integers.get(i).toString()+",");

        }

        bw.close();
    }
}
