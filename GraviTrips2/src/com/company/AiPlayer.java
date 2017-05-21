package com.company;

import java.util.Random;

public class AiPlayer extends Player {

    public AiPlayer(int playerNumber) {
        super(playerNumber);
    }


    @Override
    public int turn() {
        Random random = new Random();
        int chosenNumber = random.nextInt(7) + 1;
        System.out.println("PC have chosen " + chosenNumber);
        return chosenNumber;
    }
}
