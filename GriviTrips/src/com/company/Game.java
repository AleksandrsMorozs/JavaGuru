package com.company;

public class Game {
    private Field field;
    private Player1 player1;
    private Player2 player2;
    private PlayerPC playerPC;
    private boolean turn;
    private boolean winner;
    private char player;

    public void player1VsPlayer2() {
        field.drawEmptyField();
        while (winner == false) {
            if (turn == false) {
                player = field.PLAYER1;
                player1.turn();
                if (field.columnFullChecking() == false) {
                    field.puttingTheChip(player);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" 1st player is game winner !!!!");
                    }
                    turn = !turn;
                } else {
                    field.columnFullChecking();
                    field.puttingTheChip(player);
                }
            } else {
                player = field.PLAYER2;
                player2.turn();
                if (field.columnFullChecking() == false) {
                    field.puttingTheChip(player);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" 2nd player is game winner !!!!");
                    }
                    turn = !turn;
                } else {
                    field.columnFullChecking();
                    field.puttingTheChip(player);
                }
            }
        }

    }


    public void player1VsPc() {
        field.drawEmptyField();
        while (winner == false) {
            if (turn == false) {
                player = field.PLAYER1;
                player1.turn();
                if (field.columnFullChecking() == false) {
                    field.puttingTheChip(player);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" 1st player is game winner !!!!");
                    }
                    turn = !turn;
                } else {
                    field.columnFullChecking();
                    field.puttingTheChip(player);
                }
            } else {
                player = field.PLAYER2;
                playerPC.turn();
                if (field.columnFullChecking() == false) {
                    field.puttingTheChip(player);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" PC is game winner !!!!");
                    }
                    turn = !turn;
                } else {
                    field.columnFullChecking();
                    field.puttingTheChip(player);
                }
            }
        }

    }


    public Game(Player1 player1, Player2 player2, PlayerPC playerPC, Field field) {
        this.player1 = player1;
        this.player2 = player2;
        this.field = field;
        this.playerPC = playerPC;
    }

}



