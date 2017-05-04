package com.company;

public class Game {
    private Field field;
    private Player1 player1;
    private Player2 player2;


    public void GriviTripsGame() {
        boolean fullToGame;
        int columnToPutt;
        boolean turn = false;
        boolean winner = false;
        char player;
        boolean playerHaveChosen;
        int selectedGameMode;

        selectedGameMode = selectGameMode();
        if (selectedGameMode == 1) {
            field.drawEmptyField();
            while (winner == false) {

                if (turn == false) {
                    playerHaveChosen = player1.turn();
                    player = PlayersChars(playerHaveChosen);
                    columnToPutt = PlayerChose(playerHaveChosen);
                    fullToGame = field.columnFullChecking(columnToPutt - 1);
                    turn = mainGameplay(fullToGame, columnToPutt, playerHaveChosen, player, turn);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" 1st player is game winner !!!!");
                    }
                } else {
                    playerHaveChosen = player2.turn();
                    player = PlayersChars(playerHaveChosen);
                    columnToPutt = PlayerChose(playerHaveChosen);
                    fullToGame = field.columnFullChecking(columnToPutt - 1);
                    turn = mainGameplay(fullToGame, columnToPutt, playerHaveChosen, player, turn);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" 2nd player is game winner !!!!");
                    }

                }
            }
        } else {
            field.drawEmptyField();
            while (winner == false) {
                if (turn == false) {
                    playerHaveChosen = player1.turn();
                    player = PlayersChars(playerHaveChosen);
                    columnToPutt = PlayerChose(playerHaveChosen);
                    fullToGame = field.columnFullChecking(columnToPutt - 1);
                    turn = mainGameplay(fullToGame, columnToPutt, playerHaveChosen, player, turn);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" 1st player is game winner !!!!");
                    }
                } else {
                    playerHaveChosen = player2.turnPC();
                    player = PlayersChars(playerHaveChosen);
                    columnToPutt = PlayerChose(playerHaveChosen);
                    fullToGame = field.columnFullChecking(columnToPutt - 1);
                    turn = mainGameplay(fullToGame, columnToPutt, playerHaveChosen, player, turn);
                    winner = field.winnerCheck(player);
                    if (winner == true) {
                        System.out.println(" PC is game winner !!!!");
                    }

                }
            }
        }
    }

    private int selectGameMode() {
        int selectedGameMode;
        selectedGameMode = player2.gameSelection();
        return selectedGameMode;
    }

    private char PlayersChars(boolean playerHaveChosen) {
        char playersChar;
        if (playerHaveChosen == true) {
            playersChar = field.PLAYER1;

        } else {
            playersChar = field.PLAYER2;
        }

        return playersChar;

    }


    private int PlayerChose(boolean playerHaveChosen) {
        int playerChosenNumber;

        if (playerHaveChosen == true) {
            playerChosenNumber = player1.getChosen();
        } else {
            playerChosenNumber = player2.getChosen();
        }


        return playerChosenNumber;
    }

    private boolean mainGameplay(boolean fullToGame, int columnToPutt, boolean playerHaveChosen, char player, boolean turn) {
        if (fullToGame == false) {
            columnToPutt = PlayerChose(playerHaveChosen);
            field.puttingTheChip(player, columnToPutt - 1);
            turn = !turn;
        } else {
            field.puttingTheChip(player, columnToPutt - 1);
        }
        return turn;
    }


    public Game(Player1 player1, Player2 player2, Field field) {
        this.player1 = player1;
        this.player2 = player2;
        this.field = field;

    }
}







