package com.company;

public class Main {

    public static void main(String[] args) {
        Field field = new Field();
        Game game = new Game(field);
        Player player = new Player(field);
        //Player2 player2 = new Player2(field);
        //Player1 player1 = new Player1(field);
        field.drawEmptyField();
        player.turn();
        field.chipPlacing();
        player.turn();
        field.chipPlacing();

    }
}

