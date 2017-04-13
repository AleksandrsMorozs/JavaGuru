package com.company;

public class Game {
    Field field;
    Player1 player1;
    Player2 player2;
    private boolean turn;
    private boolean winner;


    public void gamePlay() {
        do {
            if (turn == false) {
                player1.turn();
                field.columnFullChecking();
                if (field.isFullToGame() == !true) {
                    field.chipPlacingP1();
                    field.columnFullChecking();
                    turn = !turn;
                } else {
                    field.columnFullChecking();

                    field.chipPlacingP1();
                }
            } else {
                player2.turn();
                field.columnFullChecking();
                if (field.isFullToGame() == !true) {
                    field.chipPlacingP2();
                    field.columnFullChecking();
                    turn = !turn;
                } else {
                    field.columnFullChecking();
                    field.chipPlacingP2();
                }
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



