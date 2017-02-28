package com.company;

import java.util.Random;

/**
 * Created by admin on 26.02.2017.
 */
public class WaterCane {


    public void setWater(boolean water) {
        this.water = water;
    }

    public int getWaterCaneCapacity() {
        return waterCaneCapacity;
    }

    private boolean water = false;
    Random random = new Random();
    public static final int capacity = 22;
    private int waterCaneCapacity = random.nextInt(capacity);
    public boolean setWater() {
        return water;
    }

    public int isWatering() {
        if (water == true) {
            while (waterCaneCapacity != 0) {
                waterCaneCapacity = waterCaneCapacity - 1;
                System.out.println(waterCaneCapacity);
            }
            if (waterCaneCapacity == 0) {
                water = false;
            }
        }
        return waterCaneCapacity;
    }

}




















