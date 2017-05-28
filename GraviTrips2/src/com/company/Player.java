package com.company;


import java.util.Scanner;

public abstract class Player {
    Scanner scanner = new Scanner(System.in);
    public static final char PLAYER1 = 'X';
    public static final char PLAYER2 = 'O';
    public char charXorO;

    public Player(int playerNumber) {
        int firstPlayer = 1;
        int secondPlayer = 2;
        if (playerNumber == firstPlayer) {
            charXorO = PLAYER1;
        }
        if (playerNumber == secondPlayer) {
            charXorO = PLAYER2;
        }
    }

    public abstract int turn();

    public int playerNumberInMesseges() {
        int playerNumber;
        int firstPlayer = 1;
        int secondPlayer = 2;
        if (charXorO == PLAYER1) {
            playerNumber = firstPlayer;
        } else {
            playerNumber = secondPlayer;
        }
        return playerNumber;
    }


    public String inputCheck(char lower, char upper) {
        String input = scanner.nextLine();

        return input;
    }

    public boolean checkInputBoundsInt(String input, char lowerBound, char upperBound) {
        boolean integerBounds = false;

        return integerBounds;
    }

}


