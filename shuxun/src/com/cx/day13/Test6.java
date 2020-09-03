package com.cx.day13;

import java.util.*;

public class Test6 {

    public static void main(String[] args) {

        HashSet<Book1> hashSet = new HashSet<>();
        select(hashSet);
    }

    private static void select(HashSet<Book1> hashSet) {
        Scanner s = new Scanner(System.in);
        System.out.println("功能列表：\n1.插入图书\n2.删除图书\n4.查看图书\n请输入对应id选择功能:");
        String opt = s.next();
        switch (opt) {
            case "1":
                hashSet = addBook(hashSet);
                break;
            case "2":
                deleteBook(hashSet);
                break;
            case "4":
                checkBook(hashSet);
                break;
            default:
                System.out.println("输入错误，请重新输入!");
                select(hashSet);
        }
    }

    private static HashSet<Book1> addBook(HashSet<Book1> hashSet) {
        ArrayList<Book1> arrayList = new ArrayList<>(hashSet);
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("插入图书：");
            System.out.println("input bookId:");
            int id = s.nextInt();
            System.out.println("input bookName:");
            String name = s.next();
            System.out.println("input bookAuthor:");
            String author = s.next();
            System.out.println("input bookPrice");
            double price = s.nextDouble();
            hashSet.add(new Book1(id, name, author, price));
            System.out.println("是否继续插入y/N?");
            String isNext = s.next();
            if (isNext.equals("n")) {
                System.out.println("插入完毕！");
                select(hashSet);
                break;
            } else {
                if (!isNext.equals("y")) {
                    System.out.println("请输入正确的指令！");
                    select(hashSet);
                    break;
                }
                System.out.println(hashSet);
            }
        } while (true);
        checkBook(hashSet);
        return hashSet;
    }

    private static HashSet<Book1> deleteBook(HashSet<Book1> hashSet) {
        System.out.println("删除图书");
        System.out.println("请输入要删除书籍的ID：");
        Scanner s = new Scanner(System.in);
        int deleteId = s.nextInt();
        ArrayList<Book1> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        Iterator<Book1> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Book1 b = (Book1) iterator.next();
            if (b.getId() == deleteId) {
                iterator.remove();
            }
        }
        hashSet = new HashSet<Book1>(arrayList);
        checkBook(hashSet);
        select(hashSet);
        return hashSet;
    }

    private static void checkBook(HashSet<Book1> hashSet) {//,HashSet<Book> hashSet
        System.out.println("查看图书");
        ArrayList<Book1> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        Iterator<Book1> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Book1 book = (Book1) iterator.next();
            System.out.println(book);
        }
        select(hashSet);
    }

}

class Book1 implements Comparable<Book1> {
    private int id;
    private String name;
    private String author;
    private double price;

    public Book1(Integer id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book1() {
        super();
    }

    public Integer getId() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        Book1 b = (Book1) obj;
        if (name == null) {
            if (b.name != null) {
                return false;
            }
        } else if ((id != b.id) && (!name.equals(b.name))) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Book1 o) {
        return this.getId() - o.getId();
    }

    @Override
    public int hashCode() {
        return this.id + this.name.hashCode();
    }
    @Override
    public String toString() {
        return "\nbook\tid=" + id + "\t"
                + "name=" + name + "\t"
                + "author=" + author + "\t"
                + "price=" + price + "\n";
    }



}


