package com.marianbastiurea.c02controlflow.calculate;

/*
Write a Java program that reads 10 numbers and sums all odd values between them.
 */
public class SumOfOddsValue {
    private SumOfOddsValue() {
    }

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int j : myArray) {
            if (j % 2 == 1) {
                sum = sum + j;
            }
        }
        return sum;
    }
}
