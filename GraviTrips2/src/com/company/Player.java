package com.company;


import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    public static final char PLAYER1 = 'X';
    public static final char PLAYER2 = 'O';
    public int chosenNumber;
    public char charXorO;

    public void turn(){

    }

    public int playerNumberInMesseges() {
        int playerNumber;

        if (charXorO == PLAYER1) {
            playerNumber = 1;
        } else {
            playerNumber = 2;
        }
        return playerNumber;
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

    public int getChosenNumber() {
        return chosenNumber;
    }
}


