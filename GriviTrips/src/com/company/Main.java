package com.company;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        Player1 player1 = new Player1(field);
        Player2 player2 = new Player2(field);
        PlayerPC playerPC = new PlayerPC(field);
        Game game = new Game(player1, player2, playerPC, field);
        //GriviTripsTest test = new GriviTripsTest(field);
        game.player1VsPlayer2();
       // game.player1VsPc();

    }
}

