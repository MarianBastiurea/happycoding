package org.example.c03arrays;
/*
Write a program in Java to find the second smallest element in an array.
 */

public class FindTheSecondSmallestElementInArray {
    public static int SecondSmallestElementInAnArray(int[] myArray) {
        int result, temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        result = myArray[1];
        return result;
    }
}
