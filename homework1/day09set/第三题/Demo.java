package com.itheima.day09set.第三题;

import java.util.Collections;
import java.util.TreeSet;

/*现有若干图书信息（包含名称title、作者author、定价price）需要存储到set集合中，
保证集合中无重复元素，并遍历查看。可以认为所有信息都相同的图书为重复数据。*/
public class Demo {
    public static void main(String[] args) {
        TreeSet<Book> set = new TreeSet<>();

        Book b1 = new Book("百年孤独","马尔克斯",50);
        Book b2 = new Book("百年孤独","马尔克斯",55);
        Book b3 = new Book("百年孤独","马尔克斯",30);
        Book b4 = new Book("百年孤独","马尔克斯",50);

        Collections.addAll(set,b1,b2,b3,b4);

        System.out.println("set = " + set);
    }
}

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;

    @Override
    public int compareTo(Book o) {
        int result = this.title.compareTo(o.title);

        result = result == 0 ? this.author.compareTo(o.author) : result;

        result = result == 0? this.price - o.price : result;

        return result;

    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}