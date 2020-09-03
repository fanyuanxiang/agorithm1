package com.cx.day15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable  implements Callable{
    /*
    带返回值的callable线程创建方式。
     */


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable testCallable = new TestCallable();
        FutureTask futureTask = new FutureTask<>(testCallable);  // implements RunnableFuture<V> \RunnableFuture<V> extends Runnable, Future<V>
        Thread thread = new Thread(futureTask);
        thread.start();
        Object o = futureTask.get();   //这个返回值要在线程开启后调用返回获得
        System.out.println(o);

    }

    @Override
    public String  call() throws Exception {
        //封装线程任务，并返回结果
        System.out.println("线程执行中！");
        Thread.sleep(2000);
        return "执行后结果返回值";
    }
}
