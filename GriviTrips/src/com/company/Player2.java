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
        chosen = Integer.parseInt(input);
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

    public int gameSelection(){
        String input;
        System.out.println("  --== Grivi Trips ==--  ");
        System.out.println("Select 1 to play with with Player");
        System.out.println("Select 2 to play with with PC");
        input = scanner.nextLine();
        chosen = Integer.parseInt(input);

        return chosen;
    }



    public Player2(Field field) {
        this.field = field;

    }
    public int getChosen() {
        return chosen;
    }
}


