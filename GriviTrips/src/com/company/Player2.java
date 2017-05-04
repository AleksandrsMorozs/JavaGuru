package com.company;


import java.util.Random;
import java.util.Scanner;

public class Player2 {
    Scanner scanner = new Scanner(System.in);
    private String input;
    private int chosen;
    private Field field;

    public boolean turn() {
        boolean chosenIsTrue;
        String input;
        System.out.println("2nd player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
        input = scanner.nextLine();
        while (checkInputBoundsInt(input, '1', '7') == false) {
            System.out.println("Try again");
            input = scanner.nextLine();
        }
        chosen = (int) input.charAt(0) - 48; // Char to Int
        chosenIsTrue = false;
        return chosenIsTrue;
    }

    public boolean turnPC() {
        boolean chosenIsTrue;
        Random random = new Random();
        chosen = random.nextInt(6) + 1;
        System.out.println("PC have chosen " + chosen);
        chosenIsTrue = false;
        return chosenIsTrue;
    }

    private boolean checkInputBoundsInt(String input, char lowerBound, char upperBound) {
        boolean integerBounds = false;
        if ((input.length() > 0) && (int) input.charAt(0) >= (int) lowerBound && (int) input.charAt(0) <= (int) upperBound) {
            integerBounds = true;
        }
        return integerBounds;
    }


    public int gameSelection() {
        String input;
        System.out.println("  --== Grivi Trips ==--  ");
        System.out.println("Select 1 to play with with Player");
        System.out.println("Select 2 to play with with PC");
        input = scanner.nextLine();
        while (checkInputBoundsInt(input, '1', '2') == false) {
            System.out.println("Try again");
            input = scanner.nextLine();
        }
        chosen = (int) input.charAt(0) - 48;
        return chosen;
    }


    public Player2(Field field) {
        this.field = field;

    }

    public int getChosen() {
        return chosen;
    }
}


