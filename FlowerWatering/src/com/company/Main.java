package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean waterCane = new WaterCane(true,22,);
        Random random = new Random();
        Flower flower = new Flower();
        Human human = new Human();
        Scanner scaner = new Scanner(System.in);
        Boolean waterCaneFillUpPermission = false;
        String waterCaneIsFilled;
        System.out.println("Should I fill the water cane?");
        String input = scaner.nextLine();
        if (input.equals("ok")) {
            waterCaneFillUpPermission = true;
            System.out.println("The water Cane is filled up to " + WaterCane.get + " L");
        } else {
            System.out.println("Flower is dieing, I should water it");
            System.out.println("Should I fill the water cane?");
            input = scaner.nextLine();
        }
        human.isWatering();
        System.out.println("Should I take the water cane?");
        input = scaner.nextLine();
        if (input.equals("ok")) {
            human.setTakeWaterCane(true);
            human.isWatering();
            waterCane = (true, 22)
            waterCane.Watering();
            flower.Watered();
        } else {
            System.out.println("Flower is dieing, I will water it");
            human.setTakeWaterCane(true);
            human.isWatering();
            waterCane.setWater(true);
            waterCane.Watering();
            flower.Watered();

        }


    }
}


