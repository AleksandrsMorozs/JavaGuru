package com.company;


class HumanPlayer extends Player {

    public HumanPlayer(int playerNumber) {
        if (playerNumber == 1) {
            charXorO = PLAYER1;
        }
        if (playerNumber == 2) {
            charXorO = PLAYER2;
        }
    }

    @Override
    public void turn() {
        outputMessegesPlayer();
        String input;
        input = inputCheck('1', '7');
        chosenNumber = (int) input.charAt(0) - 48;

    }

    private void outputMessegesPlayer() {
        int playerNumber;

        playerNumber = playerNumberInMesseges();
        System.out.println(playerNumber + " player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");

    }

}



