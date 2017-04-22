package com.company;


import java.util.Random;

public class PlayerPC {
    private Random random = new Random();
    private int pcChosen;
    private Field field;

    public void turn() {
        pcChosen = random.nextInt(6) + 1;
        System.out.println("PC have chosen " + pcChosen);
        field.setColumnNumber(pcChosen);
    }

    public PlayerPC(Field field) {
        this.field = field;

    }

}
