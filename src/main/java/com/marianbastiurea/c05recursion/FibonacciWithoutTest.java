package com.marianbastiurea.c05recursion;

import java.util.Arrays;

public class FibonacciWithoutTest {
    public FibonacciWithoutTest() {
    }

    public static int[] findFibonacciNumber(int numberOfElements) {
        int[] myArray = new int[numberOfElements];
        myArray[0] = 0;
        myArray[1] = 1;
        createFibonacciArray(myArray, 2);
        return myArray;
    }

    public static void createFibonacciArray(int[] array, int number) {
        if (number < array.length && number >= 2) {
            array[number] = array[number - 1] + array[number - 2];
            createFibonacciArray(array, number + 1);
        }
    }

    public static void main(String[] args) {
        int numberOfElements = 10;
        int[] array = findFibonacciNumber(numberOfElements);
        System.out.println(" First 10 elements of Fibonacci Series are: " + Arrays.toString(array));

    }

}
