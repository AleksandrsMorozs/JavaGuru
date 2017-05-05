package com.company;

import java.util.Random;


public class AiPlayer extends Player {
    private int chosen;

    public int turn() {
        int chosenIsTrue;
        Random random = new Random();
        chosen = random.nextInt(6) + 1;
        System.out.println("PC have chosen " + chosen);
        chosenIsTrue = 3;
        return chosenIsTrue;
    }

    public int getChosen() {
        return chosen;
    }
}

