package com.marianbastiurea.c03arrays.sort;

import java.util.Arrays;

public class BubbleSortAscendingWithNoTest {


    public static void main(String[] args) {
        int[] array = {1, 4, 3, 9, 1, 7, 2, 8};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
