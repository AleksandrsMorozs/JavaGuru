package com.company;


import java.util.Scanner;

public class Game {
    Field field = new Field();

    int player1;
    int player2;
    boolean turn = false;
    Scanner scanner = new Scanner(System.in);
    String input;
    int chosen;



    public int gamePlay() {
        System.out.println("Player 1, it's your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 6!");
        input = scanner.nextLine();
        chosen = Integer.parseInt(input);
        field.setChosenColumn(chosen);
        System.out.println(chosen + "!!!");

        return chosen;
    }


    }
//if (turn = false) {
           // System.out.println("Player 1, it's your turn!");
            //System.out.println("Put your chip in any free column");
            //System.out.println("choose your column, from 1 to 6!");






