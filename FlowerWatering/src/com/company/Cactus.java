package com.company;


public class Cactus extends Flower {
    private boolean Watered;

    public Boolean watering() {
        if (needwater > 10) {
            System.out.println(" Cactus: To much water for me :( ");
        } else {
            System.out.println(" Cactus: The water is tasty ");
            Watered = true;
        }
        return Watered;

    }

    public boolean isWatered() {
        return Watered;
    }
}