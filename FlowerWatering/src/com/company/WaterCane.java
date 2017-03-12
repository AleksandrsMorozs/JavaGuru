package com.company;

import java.util.Random;

public class WaterCane {
    private int cappacity = 22;
    private boolean water;
    private int waterCaneCappacity;

    public int fillingWaterIn() {
        Random random = new Random();
        waterCaneCappacity = random.nextInt(cappacity);
        System.out.println("The water Cane is filled up to " + waterCaneCappacity + " L");
        return waterCaneCappacity;
    }

    public int watering() {
        if (water == true) {
            while (waterCaneCappacity != 0) {
                waterCaneCappacity = waterCaneCappacity - 1;
                System.out.println(waterCaneCappacity);
            }
            if (waterCaneCappacity == 0) {
                water = false;
            }
        }
        return waterCaneCappacity;
    }

    public int getWaterCaneCappacity() {
        return waterCaneCappacity;
    }


    public void setWater(boolean water) {
        this.water = water;
    }
}






