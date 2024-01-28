package com.marianbastiurea.c02controlflow.transform;

/*
Write a program in Java to convert a decimal number to a binary number using the function.
 */
public class DecimalNumberToBinaryNumber {
    private DecimalNumberToBinaryNumber () {}

    public static int convertDecimalToBinary(int number) {
        int[] temporaryArray = new int[40];
        int index = 0;
        int k = 0;
        while (number > 0) {
            temporaryArray[index++] = number % 2;
            number = number / 2;
            k++;
        }
        int[] resultArray = new int[k];
        int j = 0;
        for (int i = k - 1; i >= 0; i--) {
            resultArray[j] = temporaryArray[i];
            j++;
        }
        int factor = 0;
        int result = 0;
        for (int i = 0; i < resultArray.length; i++) {
            result = resultArray[i] + factor * 10;
            factor = result;
        }
        return result;
    }
}
