package com.cx.day07;

import java.util.Scanner;

/*
模拟一个用户取钱过程，假定用户名为s 密码为123456
	•	   过程：运行程序
	•	        1.提示用户输入用户名：
	•	        2.提示用户输入密码：
	•	        3.判断用户名和输入密码是否正确 ：
	•	                  如果不正确提示：用户名和密码不正确  是否重新输入，继续输入'Y' 否则 输入'N' 退出。
	•	        4.正确则提示输入金额：要求金额为一个整数，处理输入不为整数时的异常。
	•	                           如果不正确提示：是否继续，继续输入Y 否则 输入N 退出。
 */
public class Withdraw {

        //对用户名和密码进行判断，都正确返回true，否则返回false
        public boolean check(String n,String p){
            if("s".equalsIgnoreCase(n)&&"123456".equals(p))
                return true;
            else
                return false;
        }
        public static void main(String[] args) {
            Withdraw gm=new Withdraw();
            String name="";//用户名。
            String password="";//密码。
            String next="";//用于判断是继续操作还是退出程序。
            int flag=0;//用于判断进入while循环是否是第一次。
            Scanner sc=new Scanner(System.in);
            while(!gm.check(name, password)){
                if(flag!=0){
                    System.out.println("用户名或密码错误！");
                    System.out.println("是否继续？\'是\'输入Y,\'否\'输入N:");
                    next=sc.nextLine();
                    if("N".equals(next)){
                        System.out.println("已退出，谢谢使用！");
                        return;
                    }
                }
                System.out.println("请输入用户名：");
                name=sc.nextLine();
                System.out.println("请输入密码：");
                password=sc.nextLine();
                flag=1;
            }
            while (flag==1) {//利用flag判断是否发生了异常。
                System.out.println("请输入取款金额：");
                String moneyStr=sc.nextLine();
                try {
                    int money=Integer.parseInt(moneyStr);
                } catch (NumberFormatException e) {
                    System.out.println("输入的不是整数！");
                    System.out.println("是否重新输入？    \'是\'输入Y,\'否\'输入N:");
                    next=sc.nextLine();
                    if("N".equalsIgnoreCase(next)){
                        System.out.println("已退出，谢谢使用！");
                        return;
                    }
                    continue;//重新输入取款金额则不改变flag的值，进入下一次循环。
                }
                flag=0;//flag=0表示未发生异常。
            }
            System.out.println("取款成功！");
        }
    }

