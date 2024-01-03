package org.example.c02controlflow;

/*
Write a program in Java to convert a decimal number to a binary number using the function.
 */
public class convertADecimalToBinaryNumber {
    public static int ConvertDecimalToBinary(int Number) {
        int[] temporaryArray = new int[40];
        int index = 0;
        int k = 0;
        while (Number > 0) {
            temporaryArray[index++] = Number % 2;
            Number = Number / 2;
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
