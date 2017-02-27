package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int uperLimit = 100;
        int lowerLimit = 1;

        Random random = new Random();
        int randomNumber =0;
        do {
            randomNumber = random.nextInt(uperLimit - lowerLimit + 1) + lowerLimit;
            System.out.println("Is it number " + randomNumber);
            Scanner scaner = new Scanner(System.in);
            String answer = scaner.nextLine();
            if (answer.equals("<")) {
                uperLimit = randomNumber;
            } else if (answer.equals(">")) {
                lowerLimit = randomNumber;
            } else if (answer.equals("=")) {
               break;
            }
        }
        while (lowerLimit != uperLimit );

        System.out.println("your number is " + randomNumber);

    }

}




























