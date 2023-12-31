package org.example.c03arrays;


/*
Write a program in Java to count the total number of duplicate elements in an array.
 */

public class FindDuplicateElementsInArray {

    public static int FindDuplicate(int[] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; ++i) {
            for (int j = i + 1; j < myArray.length; ++j) {
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }
        }
        if (count > myArray.length) {
            count = myArray.length;
        }
        return count;
    }
}