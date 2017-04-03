package com.company;

import java.util.Random;

public class CountUncountNumbers extends Arayy {
    private boolean isCountable;
    private int countable = 0;
    private int uncountable = 0;

    public void countUncountNumbers() {

        for (i = 0; i < I; i++) {
            if (nums[i] % 2 == 0) {
                isCountable = true;
                System.out.println("Countable   : " + nums[i]);
                countable++;
            } else {
                System.out.println("Uncountable : " + nums[i]);
                uncountable++;
            }


        }


        }
    public CountUncountNumbers( int[] nums){
        this.nums = nums;}


    public void totalNumbers() {
        System.out.println("Total countable   numbers is: " + countable);
        System.out.println("Total uncountable numbers is: " + uncountable);
    }
}

