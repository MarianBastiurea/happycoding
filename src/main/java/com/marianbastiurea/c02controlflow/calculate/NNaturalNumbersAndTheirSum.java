package com.marianbastiurea.c02controlflow.calculate;

/*
Write a program in Java to display n terms of natural numbers and their sum.

 */

public class NNaturalNumbersAndTheirSum {
    private NNaturalNumbersAndTheirSum() {
    }

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return sum;
    }
}