package org.example.c03arrays;
/*
Write a program in Java to find the second smallest element in an array.
 */

public class FindTheSecondSmallestElementInArray {
    public static int secondSmallestElement(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray[1];
    }
}
