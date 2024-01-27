package org.example.c03arrays.sort;

/*
Write a Java program to sort a list of elements using the insertion sort algorithm.
 */
public class InsertionSort {
    private InsertionSort () {}

    public static int[] sortUsingInsertion(int[] myArray) {
        for (int i = 1; i < myArray.length; i++) {
            int key = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = key;
        }
        return myArray;
    }
}
