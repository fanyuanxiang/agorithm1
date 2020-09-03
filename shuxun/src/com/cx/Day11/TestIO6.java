package com.cx.Day11;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestIO6 {


        public static void main(String[] args) {
            Scanner u=new Scanner(System.in);
            Scanner p=new Scanner(System.in);
            System.out.print("请输入用户名：");
            String username=u.next();
            System.out.print("请输入密码：");
            String password=p.next();
            File U=new File("UserName.txt");
            File P=new File("PassWord.txt");
            try {
                FileReader inU=new FileReader(U);
                char []c=new char[1024];
                int len=inU.read(c);
                String str=new String(c,0,len);
                inU.close();
                FileReader inP=new FileReader(P);
                char []a=new char[1024];
                int l=inP.read(a);
                String str1=new String(a,0,l);
                inP.close();
                if(username.equals(str)&&(password.equals(str1))){
                    System.out.println("登录成功");
                }else{
                    System.out.println("用户名或密码输入错误");
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }

}
