package com.company;

public class Game {
    private Field field;
    private HumanPlayer humanPlayer;
    private AiPlayer aiPlayer;
    private static final char FIRSTPLALYER = 1;
    private static final char SECONDPLAYER = 2;
    private static final char AI = 3;

    public void GriviTripsGame() {
        boolean turn = false;
        boolean winner = false;
        int playerToPlay;
        int selectedGameMode;
        char player;

        selectedGameMode = selectGameMode();
        if (selectedGameMode == 1) {
            field.drawEmptyField();
            while (winner == false) {
                if (turn == false) {
                    playerToPlay = humanPlayer.playersTurn(FIRSTPLALYER);
                    turn = turnInGame(playerToPlay, turn);
                    player = PlayersChars(playerToPlay);
                    winner = winnerMessege(player, playerToPlay);
                } else {
                    playerToPlay = humanPlayer.playersTurn(SECONDPLAYER);
                    turn = turnInGame(playerToPlay, turn);
                    player = PlayersChars(playerToPlay);
                    winner = winnerMessege(player, playerToPlay);
                }
            }
        } else {
            field.drawEmptyField();
            while (winner == false) {
                if (turn == false) {
                    playerToPlay = humanPlayer.playersTurn(FIRSTPLALYER);
                    turn = turnInGame(playerToPlay, turn);
                    player = PlayersChars(playerToPlay);
                    winner = winnerMessege(player, playerToPlay);
                } else {
                    playerToPlay = aiPlayer.turn();
                    turn = turnInGame(playerToPlay, turn);
                    player = PlayersChars(playerToPlay);
                    winner = winnerMessege(player, playerToPlay);
                }
            }
        }
    }


    private int selectGameMode() {
        int selectedGameMode;
        selectedGameMode = humanPlayer.gameSelection();
        return selectedGameMode;
    }

    private char PlayersChars(int player1or2) {
        char playersChar = 0;
        if (player1or2 == FIRSTPLALYER) {
            playersChar = field.PLAYER1;
        }
        if ((player1or2 == SECONDPLAYER) || (player1or2 == AI)) {
            playersChar = field.PLAYER2;
        }
        return playersChar;
    }


    private int playerChooseTheNumber(int playerToPlay) {
        int playerChosenNumber;

        if ((playerToPlay == FIRSTPLALYER) || (playerToPlay == SECONDPLAYER)) {
            playerChosenNumber = humanPlayer.getChosen();
        } else {
            playerChosenNumber = aiPlayer.getChosen();

        }
        return playerChosenNumber;
    }

    private boolean puttingChipToField(boolean fullToGame, int columnToPutt, int playerHaveChosen, char player, boolean turn) {

        if (fullToGame == false) {
            columnToPutt = playerChooseTheNumber(playerHaveChosen);
            field.puttingTheChip(player, columnToPutt - 1);
            turn = !turn;
        } else {
            field.puttingTheChip(player, columnToPutt - 1);
        }
        return turn;
    }

    public boolean turnInGame(int playerToPlay, boolean turn) {
        boolean fullToGame;
        int columnToPutt;
        char player;
        columnToPutt = playerChooseTheNumber(playerToPlay);
        fullToGame = field.columnFullChecking(columnToPutt - 1);
        player = PlayersChars(playerToPlay);
        turn = puttingChipToField(fullToGame, columnToPutt, playerToPlay, player, turn);

        return turn;
    }


    public boolean winnerMessege(char player, int playerToPlay) {
        boolean winner;

        winner = field.winnerCheck(player);
        if (winner == true) {
            if (playerToPlay == FIRSTPLALYER) {
                System.out.println(" 1st player is game winner !!!!");
            }
            if (playerToPlay == SECONDPLAYER) {
                System.out.println(" 2nd player is game winner !!!!");
            }
        }
        return winner;
    }

    private void winnerMessege4FirstPlayer() {
        System.out.println(" 1st player is game winner !!!!");
    }

    private void winnerMessege4SecondPlayer() {
        System.out.println(" 2nd player is game winner !!!!");
    }


    public Game(AiPlayer aiPlayer, HumanPlayer humanPlayer, Field field) {
        this.aiPlayer = aiPlayer;
        this.humanPlayer = humanPlayer;

        this.field = field;
    }
}




