package com.company;

/**
 * Created by admin on 05.03.2017.
 */
public class Book {
    String author;
    int yearProduced;
    String bookName;
    int numberOfPages;


    @Override
    public String toString() {
        return bookName + " " + author +" " + yearProduced + " " + numberOfPages;
    }
}
