package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Should I fill the water cane?");
        Scanner scaner = new Scanner(System.in);
        String input = scaner.nextLine();
        WaterCane watercane = new WaterCane();
        if (input.equals("ok")) {
            watercane.fillingWaterIn();

        } else {
            System.out.println("Flower is dieing, I should water it");
            System.out.println("Should I fill the water cane?");
            input = scaner.nextLine();
        }

        Human human = new Human();
        Cactus cactus = new Cactus();
        Rose rose = new Rose();
        human.waterThePlant();
        input = scaner.nextLine();
        if (input.equals("ok")) {
            human.setWaterCane(true);
            human.waterThePlant();
            cactus.needwater = watercane.getWaterCaneCappacity();
            cactus.watering();
            if (cactus.isWatered() == true) {
                watercane.setWater(true);
                watercane.watering();
            }
            if (watercane.getWaterCaneCappacity() == 0) {
                watercane.fillingWaterIn();
            }
            rose.needwater = watercane.getWaterCaneCappacity();
            rose.watering();
            if (rose.isWatered() == true) {
                watercane.setWater(true);
                watercane.watering();
            }
        } else {
            human.waterThePlant();
            input = scaner.nextLine();
        }


    }
}


