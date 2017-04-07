package com.company;

public class Game {
    Field field;
    Player1 player1;
    Player2 player2;
    boolean turn;
    private boolean winner;
    private boolean columnFull;


    public void gamePlay() {


        do {
            System.out.println(columnFull + " full start");
            columnFull = field.isColumnFull();
            while (!columnFull) {
                columnFull = field.isColumnFull();
                if (turn == false) {
                    turn = true;
                    player1.turn();
                    //System.out.println(columnFull + "full");
                    field.chipPlacingP1();
                    columnFull = field.isColumnFull();
                    //System.out.println(columnFull + "full");


                } else {
                    turn = !true;
                    player2.turn();
                    //System.out.println(columnFull + "full");
                    field.chipPlacingP2();
                    columnFull = field.isColumnFull();
                }

            }
            while (columnFull == true) {
                turn = turn;

                //System.out.println(columnFull + " must true");
               /*if (turn == false) {
                    player1.turn();
                    //System.out.println(columnFull + "full");
                    field.chipPlacingP1();
                    columnFull = field.isColumnFull();
                    //System.out.println(columnFull + "full");
                    turn = true;

                } else {
                    player2.turn();
                    //System.out.println(columnFull + "full");
                    field.chipPlacingP2();
                    turn = !true;
                }*/
            }

        }

        while (winner == false);
    }


    public Game(Player1 player1, Player2 player2, Field field) {
        this.player1 = player1;
        this.player2 = player2;
        this.field = field;
    }

}
//if (turn = false) {
// System.out.println("Player1 1, it's your turn!");
//System.out.println("Put your chip in any free column");
//System.out.println("choose your column, from 1 to 6!");







