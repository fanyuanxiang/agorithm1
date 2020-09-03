package com.cx.Day11;
import java.io.*;


public class TestIO8 {

    public static void main(String[] args) {

        int count=0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("text.txt")));
            int len;
            char[] ch=new char[1];
            while ((len=(bufferedReader.read(ch)))!=-1) {
                if (Character.compare(ch[0],'我')==0){
                    count++;
                }
            }
            System.out.println("（计数）我："+count+"次");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
