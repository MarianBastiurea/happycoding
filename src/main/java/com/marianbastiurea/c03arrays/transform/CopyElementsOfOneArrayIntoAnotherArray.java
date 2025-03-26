package com.marianbastiurea.c03arrays.transform;

/*
Write a program in Java to copy the elements of one array into another array.
*/

public class CopyElementsOfOneArrayIntoAnotherArray {
    private CopyElementsOfOneArrayIntoAnotherArray() {
    }

    public static int[] copyElements(int[] myArray) {
        int[] copyArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            copyArray[i] = myArray[i];
        }
        return copyArray;
    }
}