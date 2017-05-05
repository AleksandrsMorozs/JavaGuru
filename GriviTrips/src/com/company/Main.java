package com.company;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        HumanPlayer humanPlayer = new HumanPlayer(field);
        AiPlayer aiPlayer = new AiPlayer();
        Game game = new Game(aiPlayer, humanPlayer, field);
        game.GriviTripsGame();


    }
}

