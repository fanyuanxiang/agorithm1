package com.cx.day13;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {

        return Objects.hash(price);
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return this.price-o.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
