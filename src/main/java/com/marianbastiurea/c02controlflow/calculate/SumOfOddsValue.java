package com.marianbastiurea.c02controlflow.calculate;

/*
Write a Java program that reads 10 numbers and sums all odd values between them.
 */
public class SumOfOddsValue {
    private SumOfOddsValue() {
    }

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                sum = sum + myArray[i];
            }
        }
        return sum;
    }
}
