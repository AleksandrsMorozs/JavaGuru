package com.company;


class HumanPlayer extends Player {
    public HumanPlayer(int playerNumber) {
        super(playerNumber);
    }

    @Override
    public int turn() {
        int chosenNumber;
        outputMessegesPlayer();
        String input;
        input = inputCheck('1', '7');
        chosenNumber = (int) input.charAt(0) - 48;
        return chosenNumber;

    }

    private void outputMessegesPlayer() {
        int playerNumber = playerNumberInMesseges();
        System.out.println(playerNumber + " player make your turn!");
        System.out.println("Put your chip in any free column");
        System.out.println("choose your column, from 1 to 7!");

    }


    /*public String inputCheck(char lower, char upper) {
        String input = scanner.nextLine();
        while (!checkInputBoundsInt(input, lower, upper)) {
            System.out.println("Try again");
            input = scanner.nextLine();
        }
        return input;
    }*/


   /* public boolean checkInputBoundsInt(String input, char lowerBound, char upperBound) {
        boolean integerBounds = false;
        if ((input.length() > 0) && (int) input.charAt(0) >= (int) lowerBound && (int) input.charAt(0) <= (int) upperBound) {
            integerBounds = true;
        }
        return integerBounds;
    }*/

    // public int getChosenNumber() {return chosenNumber;}

}



