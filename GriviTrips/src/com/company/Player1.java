package com.company;


public class Player1 extends Player {
    private Field field;
    private int chosen;

    public boolean turn() {
        boolean chosenIsTrue;
        String input;
        outputMesseges2ndPlayer();
        input = super.inputCheck('1', '7');
        chosenIsTrue = true;
        chosen = (int) input.charAt(0) - 48;

        return chosenIsTrue;
    }

    private void outputMesseges2ndPlayer() {
        System.out.println("1st player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");
    }


    public Player1(Field field) {
        this.field = field;
    }

    public int getChosen() {
        return chosen;
    }
}

