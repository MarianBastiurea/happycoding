package com.marianbastiurea.c05recursion;

/*
Write a program in Java to print the first 50 natural numbers using recursion.
 */
public class CreateAnArrayWithFirstNNaturalNumbersUsingRecursion {
    private CreateAnArrayWithFirstNNaturalNumbersUsingRecursion() {
    }


    public static int[] createAnArray(int start, int numberOfElements) {
        int[] array = new int[numberOfElements];
        addElementInArray(array, start, 0);
        return array;
    }

    public static void addElementInArray(int[] array, int start, int index) {
        if (index < array.length) {
            array[index] = start;
            addElementInArray(array, start + 1, index + 1);
        }
    }
}

