package com.company;

import java.util.Scanner;

public class Player1 {
    Scanner scanner = new Scanner(System.in);
    private String input;
    private int chosen;
    Field field;

    public void turn() {
        System.out.println("1st player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
        input = scanner.nextLine();
        chosen = Integer.parseInt(input);
        field.setColumnNumber(chosen);
    }


    public Player1(Field field) {
        this.field = field;

    }
}

