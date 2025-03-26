package com.marianbastiurea.c03arrays.sort;

/*
Write a Java program to sort a list of elements using the bubble sort algorithm.
 */
public class BubbleSort {
    private BubbleSort() {
    }

    public static int[] sortArray(int[] myArray) {
        int temp;
        for (int j = 0; j < myArray.length - 1; j++) {
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] < myArray[i + 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
        }
        return myArray;
    }
}
