package com.cx.day13;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        /*
        6、编写一个Book类，该类至少有name和price两个属性。该类要实现Comparable接口，在接口的compareTo（）方法
        中规定两个Book类实例的大小关系为二者的price属性的大小关系。在主函数中，
        选择合适的集合类型存放Book类的若干个对象，然后创建一个新的Book类的对象，并检查该对象与集合中的哪些对象相等,查询结果如下图：
         */
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book("java基础教程", 29);
        Book book2 = new Book("数据库技术", 30);
        Book book3 = new Book("C++基础教程", 29);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book b :
                books) {
            System.out.println(b);
        }
        for (Book b :
                books) {
            if (book3!=b && book3.compareTo(b)==0) {
                System.out.println(b.getName() + "模式识别价格相同" + b.getPrice());
                System.out.println(book3.getName() + "模式识别价格相同" + book3.getPrice());
            }


        }



    }
}
