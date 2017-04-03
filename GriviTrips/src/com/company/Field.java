package com.company;

public class Field {

    private char X = 'X';
    private char O = 'O';
    private char empty = '.';

    public static final int ROWS = 7;
    public static final int COLUMNS = 6;
    public char[][] field = new char[ROWS][COLUMNS];
    private int chosenColumn;

    int a;

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
        System.out.println(chosenColumn + "@@@");
        System.out.println(a);
        if (chosenColumn == 1) {
           /* for (int i = 1; i < ROWS; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int rows = 0; rows < ROWS; rows++) {
                for (int columns = 0; columns < COLUMNS; columns++) {
                    System.out.print(field[rows][columns] + " ");
                }
                System.out.println();
            }*/
        }
        return chosenColumn;
    }
              public void setChosenColumn(int chosenColumn) {
                  this.chosenColumn = chosenColumn;
    }

    public void setA(int a) {
        this.a = a;
    }
}








