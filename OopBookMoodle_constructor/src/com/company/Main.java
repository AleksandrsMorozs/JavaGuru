package com.company;

public class Main {

    public static void main(String[] args) {


        Book terminator =  new Book("Terminator","O.Connor", 2001, 36254 );
        Book sayNoToSmth = new Book("Say no to smth", "B.Bean", 1990, 36544 );
        Book lifeOfNirvana = new Book("Life of Nirvana", "KurtCobein", 1997, 777);

        System.out.println(terminator.getBookName() +" " + " " + terminator.getAuthor()+ " " + terminator.getYearProduced() + " " + terminator.getNumberOfPages());
        System.out.println(sayNoToSmth.getBookName()+" " + " " + sayNoToSmth.getAuthor()+ " " + sayNoToSmth.getYearProduced() + " " + sayNoToSmth.getNumberOfPages());
        System.out.println(lifeOfNirvana.getBookName()+" " + " " + lifeOfNirvana.getAuthor()+ " " + lifeOfNirvana.getYearProduced() + " " + lifeOfNirvana.getNumberOfPages());

    }
}
