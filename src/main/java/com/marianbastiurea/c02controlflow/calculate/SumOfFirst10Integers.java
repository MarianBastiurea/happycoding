package com.marianbastiurea.c02controlflow.calculate;

/*
Write a Java program to compute the sum of the first 10 natural numbers.

 */
class SumOfFirst10Integers {
    private SumOfFirst10Integers () {}

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int i:myArray) {
            sum = sum + i;
        }
        return sum;
    }
}