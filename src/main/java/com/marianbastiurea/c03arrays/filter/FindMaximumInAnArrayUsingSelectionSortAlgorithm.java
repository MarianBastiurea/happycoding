package com.marianbastiurea.c03arrays.filter;

/*
Write a Java program to find maximum in an array using the selection sort algorithm.
 */

public class FindMaximumInAnArrayUsingSelectionSortAlgorithm {
    private FindMaximumInAnArrayUsingSelectionSortAlgorithm() {
    }

    public static int findMaximum(int[] myArray) {
        int max = 0;
        for (int i = 1; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[max]) {
                max = i;
            }
        }
        return myArray[max];
    }
}
