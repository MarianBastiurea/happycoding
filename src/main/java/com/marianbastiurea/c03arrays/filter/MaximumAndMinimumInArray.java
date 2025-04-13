package com.marianbastiurea.c03arrays.filter;

/*
Write a program in Java to find the maximum and minimum elements in an array.
 */
public class MaximumAndMinimumInArray {
    private MaximumAndMinimumInArray() {
    }

    public static int[] maximumAndMinimum(int[] myArray) {
        int[] resultArray = new int[2];
        int max = myArray[0];
        int min = myArray[0];
        for (int k : myArray) {
            max = Math.max(max, k);
        }
        for (int i : myArray) {
            min = Math.min(min, i);
        }
        resultArray[0] = max;
        resultArray[1] = min;
        return resultArray;
    }
}
