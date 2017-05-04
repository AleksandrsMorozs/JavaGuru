package com.company;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private int chosen;

    public String inputCheck(char lower, char upper) {
        String input;
        input = scanner.nextLine();
        while (checkInputBoundsInt(input, lower, upper) == false) {
            System.out.println("Try again");
            input = scanner.nextLine();
        }
        return input;
    }


    public boolean checkInputBoundsInt(String input, char lowerBound, char upperBound) {
        boolean integerBounds = false;
        if ((input.length() > 0) && (int) input.charAt(0) >= (int) lowerBound && (int) input.charAt(0) <= (int) upperBound) {
            integerBounds = true;
        }
        return integerBounds;
    }

    public int gameSelection() {
        String input;
        gameSelectionMesseges();
        input = inputCheck('1', '2');
        chosen = (int) input.charAt(0) - 48;
        return chosen;
    }

    private void gameSelectionMesseges() {
        System.out.println("  --== Grivi Trips ==--  ");
        System.out.println("Select 1 to play with with Player");
        System.out.println("Select 2 to play with with PC");
    }
}
