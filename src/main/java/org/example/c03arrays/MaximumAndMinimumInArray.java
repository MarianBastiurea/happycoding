package org.example.c03arrays;

/*
Write a program in Java to find the maximum and minimum elements in an array.
 */
public class MaximumAndMinimumInArray {
    public int[] MaximumAndMinimum(int[] myArray) {
        int[] resultArray = new int[2];
        int max = myArray[0];
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }
        for (int j = 0; j < myArray.length; j++) {
            min = Math.min(min, myArray[j]);
        }
        resultArray[0] = max;
        resultArray[1] = min;
        return resultArray;
    }
}
