package com.cx;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        A a = new A();
        Guess g = new Guess();
        g.guess(a);

    }
    public void guess(A a){
        while (true){
        Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if(i<a.V){
                System.out.println("这个猜小了。。");
            }else if (i>a.V){
                System.out.println("这个数猜大了。。");
            }else {
                System.out.println("猜对了！！");
                break;
            }
        }
    }
}
