package com.company;


import java.util.Scanner;

public class Player2 {
    Scanner scanner = new Scanner(System.in);
    private String input;
    private int chosen;
    private Field field;

    public void turn() {

        System.out.println("2nd player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
        input = scanner.nextLine();
        chosen = Integer.parseInt(input);
        field.setColumnNumber(chosen);
    }


    public Player2(Field field) {
        this.field = field;

    }
}

