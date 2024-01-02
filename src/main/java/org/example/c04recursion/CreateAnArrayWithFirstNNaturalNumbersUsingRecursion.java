package org.example.c04recursion;

/*
Write a program in Java to print the first 50 natural numbers using recursion.
 */
public class CreateAnArrayWithFirstNNaturalNumbersUsingRecursion {


    public static int[] CreateAnArray(int start, int numberOfElements) {
        int[] array = new int[numberOfElements];
        AddElementInArray(array, 1, 0);
        return array;
    }

    public static void AddElementInArray(int[] array, int start, int index) {
        if (index < array.length) {
            array[index] = start;
            AddElementInArray(array, start + 1, index + 1);
        }
    }
}

