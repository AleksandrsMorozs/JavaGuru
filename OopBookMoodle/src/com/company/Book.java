package com.company;

/**
 * Created by admin on 02.03.2017.
 */
public class Book {
    private String author;
    private int yearProduced;
    private String bookName;
    private int numberOfPages;



    public Book(String bookName, String author, int yearProduced, int numberOfPages) {
        this.author = author;
        this.yearProduced = yearProduced;
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;

    }
    public String getAuthor() {
        return author;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


}
