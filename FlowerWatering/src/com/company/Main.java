package com.company;

import com.company.Flower;
import com.company.Human;
import com.company.WaterCane;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Flower flower = new Flower();
        Human human = new Human();
        WaterCane waterCane = new WaterCane();
        Scanner scaner = new Scanner(System.in);
        Boolean waterCaneFillUpPermission = false;
        String waterCaneIsFilled;
        System.out.println("Should I fill the water cane?");
        String input = scaner.nextLine();
        if (input.equals("ok")) {
            waterCaneFillUpPermission = true;
            System.out.println("The water Cane is filled up to " + waterCane.getWaterCaneCapacity() + " L");
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
            waterCane.setWater(true);
            waterCane.isWatering();
            flower.isWarered();
        } else {
            System.out.println("Flower is dieing, I will water it");
            human.setTakeWaterCane(true);
            human.isWatering();
            waterCane.setWater(true);
            waterCane.isWatering();
            flower.isWarered();

        }


    }
}


