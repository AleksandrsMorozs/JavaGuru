package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array;
        ArrayRandom arrayRandom = new ArrayRandom();
        arrayRandom.array();
        array = arrayRandom.getNums();

        Sum sum = new Sum(array);
        sum.sum();

        CountUncountNumbers countUncount = new CountUncountNumbers(array);
        countUncount.countUncountNumbers();
        countUncount.totalNumbers();

        BiggestNumber biggestNumber = new BiggestNumber(array);
        biggestNumber.max();
        biggestNumber.tofirst();

    }
}

