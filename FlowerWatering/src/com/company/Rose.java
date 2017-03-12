package com.company;

public class Rose extends Flower {
    private boolean flowerIsWatered;

    public Boolean watering() {
        if (needwater < 10) {
            System.out.println(" Rose:  To low water for me :( ");
        } else {
            System.out.println(" Rose: The water is tasty ");
            flowerIsWatered = true;
        }
        return flowerIsWatered;

    }

    public boolean isWatered() {
        return flowerIsWatered;
    }
}
