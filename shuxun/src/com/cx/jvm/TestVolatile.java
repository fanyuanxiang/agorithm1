package com.cx.jvm;

public class TestVolatile {
    /*
    测试jmm的可见性；

    因为线程执行是从主内存拷贝数据cache中执行操作数据（有独立的方法执行栈），
    故其他线程更改了主内存中的数据，其他线程没有指定可见性，就不会发现主内存的数据被更改了，还是使用自己缓存中的数据。

   在falg加了volatile 标记说明可见性，则该程序线程可以检测到flag的变化，2秒后停止程序。

     */

         static volatile   boolean flag=true;  //使用类的全局变量线程中才好获取
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag){
            //System.out.println(1);  // public void println(boolean x) {synchronized (this) {...
                    //该方法有synchronized同步修饰，则就保证该线程从主存中读取数据。
                    System.out.println();
                }
            }
        }).start();
        Thread.sleep(2000);  //主线程休息2秒
        flag=false;
    }
}
