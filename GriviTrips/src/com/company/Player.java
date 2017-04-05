package com.company;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    public String input;
    public int chosen;
    private boolean turn;
    Field field = new Field();

    public int turn() {
        //if (turn == true){
        System.out.println("Next player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 6!");
        input = scanner.nextLine();
        chosen = Integer.parseInt(input);
        field.setChosenColumn(chosen);
        turn = false;
        System.out.println(turn);
        // }
        return chosen;
    }

    public Player(Field field) {
        this.field = field;

    }
}
   /* public void sout(){
        System.out.println(turn);
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }*/
