package com.chiry.Singleton;

public class TestDemo {
    public static void main(String[] args) {
        int i=10;
        boolean c = i++>10||i++>10&&i++>10;
        System.out.println(i);
        System.out.println(c);
    }
    class demo2{
        int a;
        public void setA(int a){
            this.a=a;
        }
    }
}
