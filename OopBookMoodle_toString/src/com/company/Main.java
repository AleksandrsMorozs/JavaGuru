package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 =  new Book();
        book1.bookName = "Terminator";
        book1.author = "O.Connor";
        book1.yearProduced = 2001;
        book1.numberOfPages = 36254;

        Book book2 = new Book();
        book2.bookName = "Say no to smth";
        book2.author = "B.Bean";
        book2.yearProduced = 1990;
        book2.numberOfPages = 36544;

        Book book3 = new Book();
        book3.bookName = "Life of Nirvana";
        book3.author = "KurtCobein";
        book3.yearProduced = 1997;
        book3.numberOfPages = 777;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
