package org.example.c03arrays.transform;

import java.util.Scanner;

/*
Write a program in Java to copy the elements of one array into another array.
*/

public class CopyElementsOfOneArrayIntoAnotherArray {
    public static int[] copyElements(int[] myArray) {
        int[] copyArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            copyArray[i] = myArray[i];
        }
        return copyArray;
    }
}