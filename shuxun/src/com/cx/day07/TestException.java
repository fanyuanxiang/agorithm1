package com.cx.day07;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        boolean  flag=true;
        while (flag) {
            System.out.println("请输入一个数字：1：caffee, 2:beer, 3:milk....  0:exit");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i==0){
                flag=false;
            }else {
            try {
                Drink drink = Drink.getDrink(i);
                drink.taste();
            } catch (DrinkNotFoundException e) {
                e.printStackTrace();
            }
            }
        }
    }
}
