package com.marianbastiurea.c03arrays.transform;

/*
Write a program in Java to read n number of values in an array and display them in reverse order.
 */

public class ReverseArray {
    private ReverseArray () {}

    public static int[] reverse(int[] myArray) {
        int[] resultArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            resultArray[myArray.length - 1 - i] = myArray[i];
        }
        return resultArray;
    }
}