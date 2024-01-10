package org.example.c03arrays;

import java.util.Arrays;
/*
Write a program in Java to merge two arrays of the same size sorted in descending order.
*/

public class MergeAndSortDescendingTwoArray {
    public int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int lengthArray = firstArray.length + secondArray.length;
        int[] myArray = new int[lengthArray];
        int i = 0, j = 0, k = 0;
        while (i < firstArray.length) {
            myArray[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < secondArray.length) {
            myArray[k] = secondArray[j];
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
