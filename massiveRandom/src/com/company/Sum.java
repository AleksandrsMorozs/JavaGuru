package com.company;

/**
 * Created by admin on 23.03.2017.
 */
public class Sum extends Arayy {
    private int arraySum = 0;

    public void sum() {

        for (   i = 0; i < I; i++)
            arraySum = arraySum + nums[i];
        System.out.println("Sum of the array is : " + arraySum);
    }


    public int getArraySum() {
        return arraySum;
    }

    public Sum(int[] nums) {
        this.nums = nums;
    }
}
