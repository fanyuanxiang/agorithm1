package com.cx;

public class Girl {

    private String name ;

    public void setName(String i){
        this.name=i;
    }
    public String getName(){
        return name;
    }
    public void marry(Boy boy){
        String name = boy.getName();
        System.out.println("marry to "+name);
    }
}
