package com.company;

public class Field {
    private char X = 'X';
    private char O = 'O';
    private char empty = '.';
    private int[] columnCounter = new int[ROWS];

    public static final int ROWS = 7;
    public static final int COLUMNS = 6;
    public char[][] field = new char[ROWS][COLUMNS];
    private int chosenColumn;

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

    public int chipPlacing() {
        //System.out.println(chosenColumn + "@@@");

        if (chosenColumn == 1) {
            columnCounter[0] = columnCounter[0] + 1;
            System.out.println(columnCounter[0] + " columncounter");

            //System.out.println("The chosen column " + chosenColumn + " is full, please chose another column");

            field[ROWS - columnCounter[0]][0] = X;
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
        }


        return chosenColumn;
    }


    public void setChosenColumn(int chosenColumn) {
        this.chosenColumn = chosenColumn;
    }


}








