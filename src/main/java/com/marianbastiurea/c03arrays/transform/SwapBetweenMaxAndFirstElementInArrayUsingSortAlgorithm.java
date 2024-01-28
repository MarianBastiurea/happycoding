package com.marianbastiurea.c03arrays.transform;

/*
Write a Java program to sort a list of elements using the selection sort algorithm.
 */
public class SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm {
    private SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm () {}

    public static int[] swapBetweenMax(int[] myArray) {
        int temp;
        int max = 0;
        for (int i = 1; i < myArray.length - 1; i++) {
            if (myArray[max] < myArray[i]) {
                max = i;
            }
        }

        int maximum = myArray[max];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == maximum) {
                temp = myArray[0];
                myArray[0] = myArray[i];
                myArray[i] = temp;
            }
        }
        return myArray;
    }
}
