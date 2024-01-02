package org.example.c03arrays;

/*
Write a program in Java to rotate an array by N positions.
Expected Output :
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
 */
public class RotateAnArrayByGivenPosition {
    public static int[] RotateArray(int[] myArray, int position) {
        int[] resultArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            if (i < position) {
                resultArray[myArray.length - position + i] = myArray[i];
            } else {
                resultArray[i - position] = myArray[i];
            }
        }
        return resultArray;
    }
}
