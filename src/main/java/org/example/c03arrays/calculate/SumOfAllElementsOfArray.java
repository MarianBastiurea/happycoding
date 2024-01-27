package org.example.c03arrays.calculate;

/*
Write a program in Java to find the sum of all elements of the array.
 */

public class SumOfAllElementsOfArray {
    private SumOfAllElementsOfArray () {}

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int i : myArray) {
            sum = sum + i;
        }
        return sum;
    }
}