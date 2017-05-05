package com.company;

public class Field {

    public static final char PLAYER1 = 'X';
    public static final char PLAYER2 = 'O';
    private static final char TOWIN = 4;
    private static final char EMPTY = '.';
    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private char[][] field = new char[ROWS][COLUMNS];
    private boolean fullToGame;
    private int whereToPutChip;

    public void drawEmptyField() {

        for (int columns = 0; columns < COLUMNS; columns++) {
            System.out.print((columns + 1) + " ");
        }
        System.out.println();
        for (int rows = 0; rows < ROWS; rows++) {
            for (int columns = 0; columns < COLUMNS; columns++) {
                field[rows][columns] = EMPTY;
                System.out.print(field[rows][columns] + " ");
            }
            System.out.println();
        }
    }


    private void fieldPrint() {

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


    public boolean columnFullChecking(int columnToPutt) {
        int toBeFull = 0;

        if (columnToPutt > COLUMNS) {
            System.out.println("This column doesn't exist");
        }
        for (int rows = 0; rows < ROWS; rows++) {
            if (columnToPutt < ROWS) {
                if (field[rows][columnToPutt] != EMPTY) {
                    toBeFull++;
                    setWhereToPutChip(toBeFull);
                    fullToGame = fullToChecking(toBeFull);
                }
            }
            setWhereToPutChip(toBeFull);
        }
        return fullToGame;
    }

    private boolean fullToChecking(int toBeFull) {
        boolean fullToGame;

        if (toBeFull != ROWS) {
            fullToGame = false;
        } else {
            fullToGame = true;
        }
        return fullToGame;

    }


    public void puttingTheChip(char player, int columnToPutt) {
        fullToGame = false;

        if (fullToGame == false) {
            if (whereToPutChip != ROWS) {
                field[(ROWS - 1) - (whereToPutChip)][columnToPutt] = player;
                //field[4][0] = player;
                fieldPrint();
            }
        } else {
            System.out.println("The column " + (columnToPutt + 1) + " is full ");
            System.out.println("chose another column!!!");
        }
    }


    private boolean wonInColumns(char player, boolean winner) {
        for (int columns = 0; columns < COLUMNS; columns++) {
            if (columnCheck(columns, player, winner)) {
                winner = true;
            }
        }
        return winner;
    }

    private boolean columnCheck(int columns, char player, boolean winner) {
        int toWin = 0;

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


    private boolean rowCheck(int rows, char player, boolean winner) {
        int toWin = 0;

        for (int columns = 0; columns < COLUMNS; columns++) {
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

    private boolean wonInRows(char player, boolean winner) {

        for (int rows = 0; rows < ROWS; rows++) {
            if (rowCheck(rows, player, winner)) {
                winner = true;
            }
        }
        return winner;
    }

    private boolean check1stDiagonal(int rows, char player, boolean winner) {
        int toWin = 0;

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

    private boolean wonIn1stDiagonal(char player, boolean winner) {

        for (int rows = ROWS - 1; rows > 0; rows--) {
            if (check1stDiagonal(rows, player, winner)) {
                winner = true;
            }
        }
        return winner;
    }

    private boolean check2ndDiagonal(int rows, char player, boolean winner) {
        int toWin = 0;

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

    private boolean wonIn2ndDiagonal(char player, boolean winner) {

        for (int rows = ROWS - 1; rows > 0; rows--) {
            if (check2ndDiagonal(rows, player, winner)) {
                winner = true;
            }

        }
        return winner;
    }

    public boolean winnerCheck(char player) {
        boolean winner = false;
        boolean column = wonInColumns(player, winner);
        boolean row = wonInRows(player, winner);
        boolean firstDiadonal = wonIn1stDiagonal(player, winner);
        boolean secondDiagonal = wonIn2ndDiagonal(player, winner);

        if ((column || row || firstDiadonal || secondDiagonal) == true) {
            return true;
        }

        return winner;
    }

    public void setWhereToPutChip(int whereToPutChip) {
        this.whereToPutChip = whereToPutChip;
    }

}











