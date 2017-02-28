package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by admin on 26.02.2017.
 */
public class Human {
    public void setTakeWaterCane(Boolean takeWaterCane) {
        this.takeWaterCane = takeWaterCane;
    }

    public Boolean getTakeWaterCane() {

        return takeWaterCane;
    }


    private boolean takeWaterCane;


    public boolean isWatering() {
        if (takeWaterCane == true) {
            System.out.println(" I am watering the flower");
        } else {
            System.out.println("I can't water flower without water cane");

        }
        return takeWaterCane;
    }

}
