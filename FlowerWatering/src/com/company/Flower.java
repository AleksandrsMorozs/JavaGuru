package com.company;

/**
 * Created by admin on 26.02.2017.
 */
public class Flower {
    private boolean isWatered;

    public void setWatered(Boolean watered) {
        isWatered = watered;
    }

    private boolean isWatered() {
        return isWatered;

    }

    public boolean isWarered() {
        if (isWatered == true) {
            System.out.println(" YEAH!!! Flower feels good");
        }
        return isWatered;

    }
}
