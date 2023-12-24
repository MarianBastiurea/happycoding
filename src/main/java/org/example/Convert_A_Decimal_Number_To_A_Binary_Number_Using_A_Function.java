package org.example;

public class Convert_A_Decimal_Number_To_A_Binary_Number_Using_A_Function {
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
