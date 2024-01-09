package org.example.c03arrays;

import java.util.Arrays;
/*
Write a program in Java to merge two arrays of the same size sorted in descending order.
*/

public class MergeAndSortDescendingTwoArray {
    public int[] mergeAndSort(int[] FirstArray, int[] SecondArray) {
        int lengthArray = FirstArray.length + SecondArray.length;
        int[] myArray = new int[lengthArray];
        int i = 0, j = 0, k = 0;
        while (i < FirstArray.length) {
            myArray[k] = FirstArray[i];
            i++;
            k++;
        }
        while (j < SecondArray.length) {
            myArray[k] = SecondArray[j];
            j++;
            k++;
        }
        Arrays.sort(myArray);
        for (int n = 0; n < lengthArray / 2; n++) {
            int temp = myArray[n];
            myArray[n] = myArray[lengthArray - n - 1];
            myArray[lengthArray - n - 1] = temp;
        }
        return myArray;
    }
}
