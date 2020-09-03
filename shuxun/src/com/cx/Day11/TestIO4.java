package com.cx.Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class TestIO4 {
    /*
    已知文件a.txt文件中的内容为“AAbcdea22dferwplkCC321ou1”,请编写程序读取该文件内容，
    要求去掉重复字母(区分大小写字母)并按照自然排序顺序后输出到b.txt文件中。即b.txt文件内容应为"abc......123..."这样的顺序输出
     */

    public static void main(String[] args) {
        //测试
//        String str1 ="AAbcdea22dferwplkCC321ou1";
//        String s2 = str1.replaceAll("(\\w)\\1+", "$1");
//        System.out.println(s2);

            //创建输入流对象
            //创建高校缓冲字符流


            try (FileReader fr = new FileReader("a.txt");
                 BufferedReader br = new BufferedReader(fr);
                 //创建输出流
                 //创建高校缓冲字符流
                 FileWriter fw = new FileWriter("b.txt");
                 BufferedWriter bw = new BufferedWriter(fw);) {
                HashSet<String> hashSet = new HashSet<>();
                ArrayList<String> arrayList = new ArrayList<>();


                String str = br.readLine();
                String[] strs = str.split("");
                for (int i = 0; i < strs.length; i++) {
                    if (hashSet.add(strs[i])) {
                        arrayList.add(strs[i]);
                    }
                }


                Collections.sort(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    bw.write(arrayList.get(i));
                }


            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }
    }
