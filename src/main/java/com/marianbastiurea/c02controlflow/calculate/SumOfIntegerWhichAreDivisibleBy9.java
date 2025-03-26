package com.marianbastiurea.c02controlflow.calculate;

/*
Write a program in Java to find the number and sum of all integers between
100 and 200 which are divisible by 9.
 */

public class SumOfIntegerWhichAreDivisibleBy9 {
    private SumOfIntegerWhichAreDivisibleBy9() {
    }

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int i = myArray[0]; i <= myArray[1]; i++) {
            if (i % 9 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}