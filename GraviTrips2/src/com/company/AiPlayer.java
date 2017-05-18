package com.company;

import java.util.Random;

public class AiPlayer extends Player {

    public AiPlayer(int playerNumber) {
        if (playerNumber == 1) {
            charXorO = PLAYER1;
        }
        if (playerNumber == 2) {
            charXorO = PLAYER2;
        }
    }
    @Override
    public void turn() {
        Random random = new Random();
        chosenNumber = random.nextInt(7) + 1;
        System.out.println("PC have chosen " + chosenNumber);
    }
}
