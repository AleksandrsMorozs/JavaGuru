package com.company;


public class Game {
    private Field field = new Field();
    private Player player1 = new HumanPlayer(1);
    private Player player2;
    private Player currentPlayer;

    public void startingTheGame() {
        int selectedGameMode;
        currentPlayer = player1;
        selectedGameMode = selectGameMode();
        if (selectedGameMode == 1) {
            //player1 = new HumanPlayer(1);
            player2 = new HumanPlayer(2);
        } else if (selectedGameMode == 2) {
           // player1 = new HumanPlayer(1);
            player2 = new AiPlayer(2);
        } else if (selectedGameMode == 3) {
            player1 = new AiPlayer(1);
            player2 = new HumanPlayer(2);
        } else {
            player1 = new AiPlayer(1);
            player2 = new AiPlayer(2);
        }
        currentPlayer = player1;
    }

    public void mainGamePlay() {
        boolean winner = false;
        int chosenNuber;
        boolean checkColumns;

        startingTheGame();
        field.drawEmptyField();
        while (!winner) {
            chosenNuber =  currentPlayer.turn();
            checkColumns = field.columnFullChecking(chosenNuber - 1);
            if (!checkColumns) {
                field.puttingTheChip(currentPlayer.charXorO, chosenNuber - 1);
                winner = winnerMessege(currentPlayer.charXorO);
                changingThePlayer();
            } else {
                field.puttingTheChip(currentPlayer.charXorO, chosenNuber - 1);
            }
        }
    }

    private void changingThePlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private int selectGameMode() {
        int selectedGameMode;
        gameSelectionMesseges();
        String input = currentPlayer.inputCheck('1', '4');
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
           playerNumber = currentPlayer.playerNumberInMesseges();
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
