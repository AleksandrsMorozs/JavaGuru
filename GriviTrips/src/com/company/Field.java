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
    private int columnNumber;
    private boolean columnFull;

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
        columnNumber = chosenColumn;
        //System.out.println(chosenColumn + "@@@");
        //System.out.println(columnNumber + "###");
        if (columnCounter[columnNumber - 1] < 7) {
            columnFull = false;
        } else {
            columnFull = true;
            System.out.println(columnFull + "fieldFull" );
        }

        if (chosenColumn == columnNumber) {
            if (columnFull == false) {
                columnCounter[columnNumber - 1] = columnCounter[columnNumber - 1] + 1;


                System.out.println(columnCounter[columnNumber - 1] + " columncounter");

                //System.out.println("The chosen column " + chosenColumn + " is full, please chose another column");

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
                System.out.println("The chosen column " + chosenColumn + " is full, please chose another column");
            }
        }


        return chosenColumn;
    }

    public int chipPlacingP2() {
        columnNumber = chosenColumn;
        //System.out.println(chosenColumn + "@@@");
        if (columnCounter[columnNumber - 1] < 7) {
            columnFull = false;
        } else {
            columnFull = true;
           System.out.println(columnFull + "fieldFull");
        }

        if (chosenColumn == columnNumber) {
            if (columnFull == false) {
                columnCounter[columnNumber - 1] = columnCounter[columnNumber - 1] + 1;

                //System.out.println(columnCounter[columnNumber - 1] + " columncounter");

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
                System.out.println("The chosen column " + chosenColumn + " is full, please chose another column");
            }


        }
        return chosenColumn;
    }

    public void setChosenColumn(int chosenColumn) {
        this.chosenColumn = chosenColumn;
    }

    public boolean isColumnFull() {
        return columnFull;
    }
}








