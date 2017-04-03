package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Field field = new Field();
        field.drawEmptyField();
        game.gamePlay();
        field.chipPlacing();
        field.setA(7);
    }
}

