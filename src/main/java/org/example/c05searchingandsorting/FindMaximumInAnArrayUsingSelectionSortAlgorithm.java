package org.example.c05searchingandsorting;

/*
Write a Java program to find maximum in an array using the selection sort algorithm.
 */

public class FindMaximumInAnArrayUsingSelectionSortAlgorithm {
    public static int FindMaximumInArray(int[] myArray) {
        int max = 0;
        for (int i = 1; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[max]) {
                max = i;
            }
        }
        int maximum = myArray[max];
        return maximum;
    }
}
