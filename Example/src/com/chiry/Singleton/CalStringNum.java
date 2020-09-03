package com.chiry.Singleton;
/*
1.算法题，计算超大数据相加
 */

public class CalStringNum {
    public static void main(String[] args) {
        String a ="1000";
        String b ="299999";
        char[] large=null;
        char[] small=null;
        if (b.length()>=a.length()){
            large=b.toCharArray();
            small=a.toCharArray();
        }else {
            large=a.toCharArray();
            small=b.toCharArray();
        }

        int [] sums= new int[large.length+1];
        //计算
        for (int i = 0; i < large.length; i++) {
            sums[i]=large[large.length-i-1]-'0';  //char 转换为整型数  ,sums【】存储数据的倒序
        }
        for (int i=0;i<small.length;i++){
            sums[i]+=small[small.length-i-1]-'0';
        }
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }

        for (int i = 0; i < sums.length; i++) {
            if(sums[i]>9){
                sums[i+1] +=sums[i]/10;
                sums[i]=sums[i]%10;
            }
        }

        StringBuilder s =new StringBuilder();
        for (int i = 0; i < sums.length; i++) {
            s.append(sums[sums.length-i-1]);
        }


        String result = s.toString();
        if(result.startsWith("0")){
            result= result.substring(1);
        }

        System.out.println(result);

    }
}
