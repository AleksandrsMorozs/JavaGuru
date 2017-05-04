package com.company;


import java.util.Random;

public class Player2 extends Player {
    private int chosen;
    private Field field;

    public boolean turn() {
        boolean chosenIsTrue;
        String input;
        outputMesseges1stPlayer();
        input = super.inputCheck('1', '7');
        chosenIsTrue = false;
        chosen = (int) input.charAt(0) - 48;
        return chosenIsTrue;
    }

    private void outputMesseges1stPlayer() {
        System.out.println("2ndst player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
    }

    public boolean turnPC() {
        boolean chosenIsTrue;
        Random random = new Random();
        chosen = random.nextInt(6) + 1;
        System.out.println("PC have chosen " + chosen);
        chosenIsTrue = false;
        return chosenIsTrue;
    }

    public void setChosen(int chosen) {
        this.chosen = chosen;
    }


    public Player2(Field field) {
        this.field = field;

    }
    public int getChosen() {
        return chosen;
    }

}


