package com.cx.Day11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestIO7 {

    public static void main(String[] args) {
        System.out.println("请输入一个密码读取统计文件数据：");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        if(key.equals("mima")){
           count();
        }
        return;
    }
        public static void  count(){

        HashMap<Character, Integer> map = new HashMap<>();
        File file = new File("count.txt");
        if(!file.exists()){
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedReader bufferedReader=null;
        try {
            bufferedReader= new BufferedReader(new FileReader(file));
            String line ;
            while((line = bufferedReader.readLine())!=null){
                for (int i = 0; i <line.length(); i++) {
                    char c = line.charAt(i);
                    if(!( (c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z') ) ){
                        continue;
                    }
                    if(map.containsKey(c)){
                        map.put(c,map.get(c)+1);
                    }else {
                        map.put(c,1);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Set<Character> characters = map.keySet();
            BufferedWriter bw=null;
            try {
                bw = new BufferedWriter(new FileWriter(new File("sum.txt")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Character character : characters) {

                try {
                    bw.write(character+":"+map.get(character));

                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(character+":"+map.get(character));
        }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}

