package com.company;

public class Field {

    private char X = 'X';
    private char O = 'O';
    private char empty = '.';
    private int[] columnCounter = new int[ROWS];

    private static final int ROWS = 7;
    private static final int COLUMNS = 6;
    private char[][] field = new char[ROWS][COLUMNS];
    private int chosenColumn;
    private int columnNumber;
    private boolean[] columnFull = new boolean[ROWS];

    private boolean fullToGame;

    public void drawEmptyField() {
        for (int i = 1; i < ROWS; i++) {
            System.out.print(i + " ");
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

    public int chipPlacingP1() {
        if (columnFull[columnNumber - 1] == false) {
            columnCounter[columnNumber - 1] = columnCounter[columnNumber - 1] + 1;
            field[ROWS - columnCounter[columnNumber - 1]][chosenColumn - 1] = X;
            for (int i = 1; i < ROWS; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int rows = 0; rows < ROWS; rows++) {
                for (int columns = 0; columns < COLUMNS; columns++) {
                    System.out.print(field[rows][columns] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("The column " + columnNumber + " is full ");
            System.out.println("chose another column!!!");
        }
        return chosenColumn;
    }

    public int chipPlacingP2() {

        columnNumber = chosenColumn;


        if (columnFull[columnNumber - 1] == false) {
            columnCounter[columnNumber - 1] = columnCounter[columnNumber - 1] + 1;
            field[ROWS - columnCounter[columnNumber - 1]][chosenColumn - 1] = O;
            for (int i = 1; i < ROWS; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int rows = 0; rows < ROWS; rows++) {
                for (int columns = 0; columns < COLUMNS; columns++) {
                    System.out.print(field[rows][columns] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("The column " + columnNumber + " is full ");
            System.out.println("chose another column!!!");
        }
        return chosenColumn;
    }

    public boolean columnFullChecking() {
        columnNumber = chosenColumn;
        if (columnNumber >= 7) {
            System.out.println("This column doesn't exist");
        }
        if (columnCounter[columnNumber - 1] < 7) {
            columnFull[columnNumber - 1] = false;
            fullToGame = columnFull[columnNumber - 1];
        } else {
            columnFull[columnNumber - 1] = true;
            fullToGame = columnFull[columnNumber - 1];
        }
        return fullToGame;
    }

    public boolean isFullToGame() {
        return fullToGame;
    }

    public void setChosenColumn(int chosenColumn) {
        this.chosenColumn = chosenColumn;
    }
}









