package com.company;

import java.util.Random;

/**
 * Created by admin on 26.02.2017.
 */
public class WaterCane {
    private boolean water = false;
    Random random = new Random();
    private int waterCaneCapacity = random.nextInt();
    public int Watering() {
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


    public void setWater(boolean water) {
        this.water = water;
    }
    public int getWaterCaneCapacity() {
        return waterCaneCapacity;
    }
    public WaterCane (Boolean water, final int capacity) {

    }
    public boolean setWater() {
        return water;

    }


}















