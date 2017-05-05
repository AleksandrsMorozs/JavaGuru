package com.company;

import java.util.Scanner;

public class HumanPlayer {
    Scanner scanner = new Scanner(System.in);
    private Field field;
    private int chosen;


    public int playersTurn(int firstOrSecondPlayer) {
        String input;
        if (firstOrSecondPlayer == 1) {
            outputMesseges1stPlayer();
            input = inputCheck('1', '7');
            chosen = (int) input.charAt(0) - 48;
        }
        if (firstOrSecondPlayer == 2) {
            outputMesseges2ndPlayer();
            input = inputCheck('1', '7');
            chosen = (int) input.charAt(0) - 48;
        }

        return firstOrSecondPlayer;
    }

    private void outputMesseges1stPlayer() {
        System.out.println("1st player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
    }


    private void outputMesseges2ndPlayer() {
        System.out.println("2nd player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
    }


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


    public HumanPlayer(Field field) {
        this.field = field;
    }

    public int getChosen() {
        return chosen;
    }
}


