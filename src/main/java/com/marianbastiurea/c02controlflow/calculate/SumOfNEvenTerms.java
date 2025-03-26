package com.marianbastiurea.c02controlflow.calculate;



/*
 Write a Java program to display the sum of n terms of even natural numbers.
 */

public class SumOfNEvenTerms {
    private SumOfNEvenTerms() {
    }

    public static int findSum(int number) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            count = count + 2;
            sum = sum + count;
        }
        return sum;
    }
}