package com.cx;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {


  public static void main(String[] args) {
    System.out.println("请输入字符串！！！");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    System.out.println("反转后的字符串：");
    StringBuilder stringBuilder = new StringBuilder(str);
    String s = stringBuilder.reverse().toString();
    System.out.println(s);
  }

 @Test
public void testReverseStr(){
   System.out.println("请输入字符串！！！");
   Scanner scanner = new Scanner(System.in);
   String str = scanner.next();
   System.out.println("反转后的字符串：");
   StringBuilder stringBuilder = new StringBuilder(str);
   String s = stringBuilder.reverse().toString();
   System.out.println(s);
 }


}
