package com.company;

import java.util.Scanner;

public class Player1 {
    Scanner scanner = new Scanner(System.in);
    private Field field;
    private int chosen;

    public boolean turn() {
        boolean chosenIsTrue;
        String input;
        System.out.println("1st player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
        input = scanner.nextLine();
        chosen = Integer.parseInt(input);
        chosenIsTrue = true;

        return chosenIsTrue;
    }



    public Player1(Field field) {
        this.field = field;

    }

    public int getChosen() {
        return chosen;
    }
}

