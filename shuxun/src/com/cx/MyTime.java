package com.cx;

public class MyTime {
    private int hour;
    private int minute ;
    private int second;
    public MyTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void display(){
        System.out.println("时间："+hour+":"+minute+":"+second);
    }
    public void addHour(int h){
        hour+=h;
    }
    public void addMinute(int m){
        minute+=m;
        if(minute>60){
            addHour(minute/60);
            minute=minute%60;
        }
    }

    public void addSecond(int s){
        second+=s;
        if(second>60){
            minute++;
            second-=60;
        }
    }
    public void subHour(int h){
        hour-=h;
        if(hour<0){
            hour=0;
            minute=0;
            second=0;
        }
    }
    public void subMinute(int m){
       if(m>=60){
           subHour(m/60);
           minute-=m%60;
       }else {
           minute-=m;
       }

    }
    public void subSecond(int s){
        second-=s;
        if(second<0){
            second=-second;
            subHour (second/60);
            second=second%60;
        }
    }


}
