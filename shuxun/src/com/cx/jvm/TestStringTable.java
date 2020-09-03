package com.cx.jvm;

public class TestStringTable {
    public static void main(String[] args) throws InterruptedException {
        //二进制字节码文件（类的基本信息、常量池、类中的方法定义--包含了虚拟机指令）
        //1.（静态）常量池：在.class 文件中，存储不仅是字符串的字量，还包括了类、方法信息；字面量literal、符号引用Symbolic Reference
        //2。运行时常量池：（1.8）jvm装载进系统内存，并保存在方法区中


        /*
        常用字节码指令解释：

        ldc：操作indexbyte1 常量池中的常量数进栈 ，  （indexbyte :search for byte in a memory range）
        ldc_w： 操作indexbyte1 indexbyte2 进栈
        aload: 从局部变量indexbyte中装载引用类型进栈
        astore:将栈顶引用类型值保存到局部变量indexbyte中
        getfield :获取对象字段的值
        putfield :给对象字段赋值
        getstatic :获取静态对象
        pubtstatic :给静态对象赋值
        new :创建新的对象实例
        dup : 复制栈顶数，并复制值压入栈顶

        invokespecial : 编译时方法绑定调用方法    <init> 、private 方法、super.method() 编译时可以确定的方法
        invokevirtual :运行时方法绑定调用方法      动态分配指令，引用类型并不可以确定的类型
        invokestatic : 调用静态方法
        invokeinterface :调用接口方法

         */
        String s1="a";   //1.开始存储在字节码文件中——> 2.常量池中——->3.运行时常量池（1.8系统元空间）->引用执行变成java字符串对象
        String s2="b";
        String s3="ab";
        String s4=s1+s2 ;   //new StringBuilder.append("a").append("b").toString(); new String("ab");
// 变量拼接ab的对象不会进串池 ，
// 使用s4.intern()可以放入串池，并返回该串池对象，存在则不放入（1.8）
// 1.6会把对象拷贝一份放入常量池所以其本身对象还是在堆中不会与常量池相同
        String s5="a"+"b";    //编译优化，直接获取常量池中ab字符串
        String s6=s1+s2+"c";
        System.out.println(s3==s5);
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        String intern = s4.intern();
        System.out.println(intern==s6);



    }
}
