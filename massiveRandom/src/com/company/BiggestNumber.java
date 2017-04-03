package com.company;


public class BiggestNumber extends Arayy {
    private int maxNumber = 0;


    public void max() {
        for (i = 0; i < I; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
        }
        System.out.println("the biggest number is " + maxNumber);
    }

    private int firstNumber;

    public void tofirst() {
        firstNumber = nums[0];
        for (i = 0; i < I; i++) {
            if (nums[i] == maxNumber) {
                //System.out.println(firstNumber + "!!!");
                //System.out.println(maxNumber + " max");
                nums[i] = firstNumber;
            }
        }
        for (i = 0; i < I; i++) {
            nums[0] = maxNumber;
            System.out.println("Array " + i + ": " + nums[i]);
        }
    }

    public BiggestNumber(int[] nums) {
        this.nums = nums;
    }
}
