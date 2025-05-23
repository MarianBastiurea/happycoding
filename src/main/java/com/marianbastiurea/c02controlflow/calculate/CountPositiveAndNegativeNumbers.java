package com.marianbastiurea.c02controlflow.calculate;


/*
Write a Java program that reads 5 numbers and counts the number of positive numbers and negative numbers.
*/
public class CountPositiveAndNegativeNumbers {
    private CountPositiveAndNegativeNumbers() {
    }

    public static int[] count(int[] myArray) {
        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int[] result = new int[2];
        for (int i : myArray) {
            if (i < 0) {
                negativeNumbers++;
            } else {
                positiveNumbers++;
            }
        }
        result[0] = positiveNumbers;
        result[1] = negativeNumbers;
        return result;
    }
}
