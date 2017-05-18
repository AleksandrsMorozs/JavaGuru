package com.company;


public class Game {
    private Field field;
    private Player player1;
    private Player player2;
    private Player playerToSelectGame = new Player();
    private Player tempPlayer;

    public Game() {
        field = new Field();
    }


    public void startingTheGame() {
        int selectedGameMode;
        selectedGameMode = selectGameMode();

        if (selectedGameMode == 1) {
            player1 = new HumanPlayer(1);
            player2 = new HumanPlayer(2);
        } else if (selectedGameMode == 2) {
            player1 = new HumanPlayer(1);
            player2 = new AiPlayer(2);
        } else if (selectedGameMode == 3) {
            player1 = new AiPlayer(1);
            player2 = new HumanPlayer(2);
        } else {
            player1 = new AiPlayer(1);
            player2 = new AiPlayer(2);
        }
        tempPlayer = player1;
    }

    public void mainGamePlay() {
        boolean winner = false;
        int chosenNuber;
        boolean checkColumns;

        startingTheGame();
        field.drawEmptyField();
        while (!winner) {
            tempPlayer.turn();
            chosenNuber = tempPlayer.getChosenNumber();
            checkColumns = field.columnFullChecking(chosenNuber - 1);
            if (!checkColumns) {
                field.puttingTheChip(tempPlayer.charXorO, chosenNuber - 1);
                winner = winnerMessege(tempPlayer.charXorO);
                changingThePlayer();
            } else {
                field.puttingTheChip(tempPlayer.charXorO, chosenNuber - 1);
            }
        }
    }

    private void changingThePlayer() {
        if (tempPlayer == player1) {
            tempPlayer = player2;
        } else {
            tempPlayer = player1;
        }
    }

    private int selectGameMode() {
        int selectedGameMode;

        String input;
        gameSelectionMesseges();
        input = playerToSelectGame.inputCheck('1', '4');
        selectedGameMode = (int) input.charAt(0) - 48;
        return selectedGameMode;
    }

    private void gameSelectionMesseges() {
        System.out.println("  --== Grivi Trips ==--  ");
        System.out.println("Select 1 to play Player vs Player");
        System.out.println("Select 2 to play Player with PC");
        System.out.println("Select 3 to play PC with Player");
        System.out.println("Select 4 to play PC with PC");
    }

    public boolean winnerMessege(char charXorO) {
        boolean winner;
        int playerNumber;
        boolean draw;
        winner = field.winnerCheck(charXorO);
        draw = field.fieldCheckOnDraw();
        if (winner) {
           playerNumber = tempPlayer.playerNumberInMesseges();
            System.out.println(playerNumber + " player is game winner !!!!");
        }
        if (draw){
            winner = true;
            System.out.println("Game over!!!");
            System.out.println("Draw!!!");
            System.out.println("No game winner!!!");
        }
        return winner;
    }
}
