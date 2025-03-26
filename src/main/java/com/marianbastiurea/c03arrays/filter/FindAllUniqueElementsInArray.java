package com.marianbastiurea.c03arrays.filter;

/*
Write a program in Java to print all unique elements in an array.
*/

public class FindAllUniqueElementsInArray {
    private FindAllUniqueElementsInArray() {
    }

    public static int[] uniqueElement(int[] myArray) {
        int count, k = 0;
        int[] temporaryArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            count = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (i != j) {
                    if (myArray[i] == myArray[j]) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                temporaryArray[i] = myArray[i];
                k++;
            }
        }
        int[] resultArray = new int[k];
        int j = 0;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (temporaryArray[i] != 0) {
                resultArray[j] = temporaryArray[i];
                j++;
            }
        }
        return resultArray;
    }
}
