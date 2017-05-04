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
        while (checkInputBoundsInt(input, '1', '7') == false) {
            System.out.println("Try again");
            input = scanner.nextLine();
        }
        chosenIsTrue = true;
        chosen = (int) input.charAt(0) - 48;
        return chosenIsTrue;
    }

    private boolean checkInputBoundsInt(String input, char lowerBound, char upperBound) {
        boolean integerBounds = false;
        if ((input.length() > 0) && (int) input.charAt(0) >= (int) lowerBound && (int) input.charAt(0) <= (int) upperBound) {
            integerBounds = true;
        }
        return integerBounds;
    }


    public Player1(Field field) {
        this.field = field;

    }

    public int getChosen() {
        return chosen;
    }
}

