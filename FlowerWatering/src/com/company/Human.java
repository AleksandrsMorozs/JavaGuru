package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by admin on 26.02.2017.
 */
public class Human {
    private boolean waterCane;

    private boolean isWaterCane() {
        return waterCane;
    }

    public void setTakeWaterCane(Boolean takeWaterCane) {
        this.takeWaterCane = takeWaterCane;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public Boolean getTakeWaterCane() {

        return takeWaterCane;
    }

    public Boolean getWater() {
        return water;
    }

    private boolean takeWaterCane;
    private boolean water;


    public boolean isWatering() {
        if (water == true) {
            if (takeWaterCane == true) {
                waterCane = true;
                System.out.println(" I am watering the flower");
            } else {
                System.out.println("I can't water flower without water cane");

            }
        }
        return waterCane;

    }
}
