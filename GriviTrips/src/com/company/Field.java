package com.company;

import java.time.format.SignStyle;
import java.util.Random;

public class Field {

    public static final char PLAYER1 = 'X';
    public static final char PLAYER2 = 'O';
    private static final char TOWIN = 4;
    private char empty = '.';
    private int[] columnCounter = new int[COLUMNS];
    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private int toWin;
    private char[][] field = new char[ROWS][COLUMNS];
    private int chosenColumn;
    private int columnNumber;
    private boolean[] columnFull = new boolean[COLUMNS];
    private boolean winner;
    private boolean fullToGame;

    public void drawEmptyField() {

        for (int columns = 0; columns < COLUMNS; columns++) {
            System.out.print((columns + 1) + " ");
        }
        System.out.println();
        for (int rows = 0; rows < ROWS; rows++) {
            for (int columns = 0; columns < COLUMNS; columns++) {
                field[rows][columns] = empty;
                System.out.print(field[rows][columns] + " ");
            }
            System.out.println();
        }
    }


    public void fieldPrint() {
        for (int columns = 0; columns < COLUMNS; columns++) {
            System.out.print((columns + 1) + " ");
        }
        System.out.println();
        for (int rows = 0; rows < ROWS; rows++) {
            for (int columns = 0; columns < COLUMNS; columns++) {
                System.out.print(field[rows][columns] + " ");
            }
            System.out.println();
        }
    }


    public void puttingTheChip(char player) {
        chosenColumn = columnNumber - 1;
        if (columnFull[chosenColumn] == false) {
            columnCounter[chosenColumn] = columnCounter[chosenColumn] + 1;
            //field[5][1]=player;
            field[ROWS - columnCounter[chosenColumn]][chosenColumn] = player;
            fieldPrint();
        } else {
            System.out.println("The column " + (chosenColumn + 1) + " is full ");
            System.out.println("chose another column!!!");
        }
    }


    public boolean columnFullChecking() {
        chosenColumn = columnNumber - 1;
        if (chosenColumn > COLUMNS) {
            System.out.println("This column doesn't exist");
        }
        if (columnCounter[chosenColumn] < ROWS) {
            columnFull[chosenColumn] = false;
            fullToGame = columnFull[chosenColumn];
        } else {
            columnFull[chosenColumn] = true;
            fullToGame = columnFull[chosenColumn];
        }
        return fullToGame;
    }


    public boolean wonInColumns(char player) {
        for (int columns = 0; columns < COLUMNS; columns++) {
            if (columnCheck(columns, player)) {
                winner = true;
            }
        }
        return winner;
    }

    public boolean columnCheck(int columns, char player) {
        toWin = 0;
        for (int rows = 0; rows < ROWS; rows++) {
            if (field[rows][columns] == player) {
                toWin++;
                if (toWin == TOWIN) {
                    winner = true;
                }
            } else {
                toWin = 0;
            }
        }
        return winner;
    }


    public boolean rowCheck(int rows, char player) {
        toWin = 0;
        for (int columns = 0; columns < COLUMNS; columns++) {
            if (field[rows][columns] == player) {
                toWin++;
                if (toWin == TOWIN) {
                    winner = true;
                    //System.out.println(winner + " 1st player is game winner !!!!");
                }
            } else {
                toWin = 0;
            }
        }
        return winner;
    }

    public boolean wonInRows(char player) {
        for (int rows = 0; rows < ROWS; rows++) {
            if (rowCheck(rows, player)) {
                winner = true;
            }
        }
        return winner;
    }

    public boolean check1stDiagonal(int rows, char player) {
        toWin = 0;
        for (int columns = 0; columns < COLUMNS; columns++) {
            if (field[rows][columns] == player) {
                toWin++;
                rows--;
                if (rows < 0) {
                    rows = ROWS - 1;
                }
            } else {
                toWin = 0;
            }
            if (toWin == TOWIN) {
                winner = true;
            }
        }
        return winner;
    }

    public boolean wonIn1stDiagonal(char player) {

        for (int rows = ROWS - 1; rows > 0; rows--) {
            if (check1stDiagonal(rows, player)) {
                winner = true;
            }
        }
        return winner;
    }

    public boolean check2ndDiagonal(int rows, char player) {
        toWin = 0;
        for (int columns = COLUMNS - 1; columns > 0; columns--) {
            if (field[rows][columns] == player) {
                toWin++;
                rows--;
                if (rows < 0) {
                    rows = ROWS - 1;
                }
            } else {
                toWin = 0;
            }
            if (toWin == TOWIN) {
                winner = true;
            }

        }
        return winner;
    }

    public boolean wonIn2ndDiagonal(char player) {
        for (int rows = ROWS - 1; rows > 0; rows--) {
            if (check2ndDiagonal(rows, player)) {
                winner = true;
            }

        }
        return winner;
    }

    public boolean winnerCheck(char player) {
        wonInColumns(player);
        wonInRows(player);
        wonIn1stDiagonal(player);
        wonIn2ndDiagonal(player);
        return winner;
    }


    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public boolean columnCheck4test(int columns, char player) {
        toWin = 0;
        for (int rows = 0; rows < ROWS; rows++) {
            if (field[rows][columns] == player) {
                toWin++;
                if (toWin == TOWIN) {
                    winner = true;
                }
            } else {
                toWin = 0;
            }
        }
        return winner;
    }
   /* public boolean wonInColumns4test(char player, Field field) {
        for (int columns = 0; columns < COLUMNS; columns++) {
            if (columnCheck4test(columns, player, field)) {
                winner = true;
            }
        }
        return winner;
    }

    public boolean rowCheck4test(int rows, char player, Field field) {
        toWin = 0;
        for (int columns = 0; columns < COLUMNS; columns++) {
            if (field[rows][columns] == player) {
                toWin++;
                if (toWin == TOWIN) {
                    winner = true;
                    //System.out.println(winner + " 1st player is game winner !!!!");
                }
            } else {
                toWin = 0;
            }
        }
        return winner;
    }*/
}











