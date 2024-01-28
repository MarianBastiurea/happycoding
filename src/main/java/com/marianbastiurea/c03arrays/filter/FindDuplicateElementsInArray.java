package com.marianbastiurea.c03arrays.filter;


/*
Write a program in Java to count the total number of duplicate elements in an array.
 */

public class FindDuplicateElementsInArray {
    private FindDuplicateElementsInArray () {}


    public static int findDuplicate(int[] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}