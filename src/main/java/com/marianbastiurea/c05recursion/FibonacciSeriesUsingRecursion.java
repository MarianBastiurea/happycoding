package com.marianbastiurea.c05recursion;

/*
Write a program in Java to print the Fibonacci Series using recursion.
 */
public class FibonacciSeriesUsingRecursion {
    private FibonacciSeriesUsingRecursion() {
    }


    public static int[] firstNElements(int numberOfElements) {
        int[] myArray = new int[numberOfElements];
        myArray[0] = 0;
        myArray[1] = 1;
        addFirstNElements(myArray, 2);
        return myArray;
    }

    public static void addFirstNElements(int[] myArray, int index) {
        if (index < myArray.length && index >= 2) {
            myArray[index] = myArray[index - 2] + myArray[index - 1];
            addFirstNElements(myArray, index + 1);
        }
    }
}
