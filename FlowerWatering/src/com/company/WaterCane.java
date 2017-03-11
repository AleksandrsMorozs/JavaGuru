package com.company;

import java.util.Random;

/**
 * Created by admin on 26.02.2017.
 */
public class WaterCane {
    private boolean water = false;
    Random random = new Random();
    /*final int capacity = 22;
    public WaterCane(Random random, int capacity, int waterCaneCapacity) {
        waterCaneCapacity = random.nextInt(this.capacity);
    }*/
    final int capacity = 22;
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

    public WaterCane(Boolean water, final int capacity) {

    }

    public boolean setWater() {
        return water;

    }


}















