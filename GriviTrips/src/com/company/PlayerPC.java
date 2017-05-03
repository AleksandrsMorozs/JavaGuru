package com.company;


import java.util.Random;

public class PlayerPC {

    private int pcChosen;
    private Field field;

    public void turn() {
        Random random = new Random();
        pcChosen = random.nextInt(6) + 1;
        System.out.println("PC have chosen " + pcChosen);
        //field.setColumnNumber(pcChosen);
    }

    public PlayerPC(Field field) {
        this.field = field;

    }

    public int getChosen() {
        return pcChosen;
    }
}
