package com.company;

import java.util.Scanner;

public class Player1 {
    Scanner scanner = new Scanner(System.in);
    public String input;
    public int chosen;
    private boolean turn;
    Field field;

    public int turn() {
            System.out.println("Next player make your turn!");
            System.out.println("Put your chip in any free column");
            System.out.println("choose your column, from 1 to 6!");
            input = scanner.nextLine();
            chosen = Integer.parseInt(input);
            field.setChosenColumn(chosen);
            //System.out.println(turn);
            // }
        return chosen;
        }



    public boolean isTurn() {
        return turn;
    }

   public Player1(Field field) {
      this.field = field;

    }
}
   /* public void sout(){
        System.out.println(turn);
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }*/
