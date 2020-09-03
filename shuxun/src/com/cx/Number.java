package com.cx;

public class Number {
    private int n1;
    private int n2;
    public Number(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public int addition(){
        return n1+n2;
    }
    public int subtration(){
        return n1-n2;
    }
    public int division(){
        if (n2==0){
            System.out.println("数学错误，n1/ by zero ");
            return 0;
        }
        return n1/n2;
    }
    public int multiplication(){
        return n1*n2;
    }

}
