package com.marianbastiurea.c03arrays.sort;

import java.util.Arrays;

public class Selection {

    public static int[] selectionSort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = myArray[minIndex];
            myArray[minIndex]=myArray[i];
            myArray[i]=temp;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 5, 3, 7, 0, 8, -1};
        System.out.println("This is sorted array: " + Arrays.toString(selectionSort(myArray)));
    }
}
