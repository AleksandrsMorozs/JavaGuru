package com.company;

public class Human {
    private boolean WaterCane;

    public boolean waterThePlant() {
        if (WaterCane == true) {
            System.out.println(" I am watering the flower ");
        } else {
            System.out.println(" I can't water flower without water cane ");
            System.out.println(" Should i take it? ");

        }
        return WaterCane;
    }


    public void setWaterCane(boolean waterCane) {
        this.WaterCane = waterCane;
    }
}
