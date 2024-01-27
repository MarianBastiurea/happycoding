package org.example.c03arrays.transform;

/*
Write a program in Java to separate odd and even integers into separate arrays.
 */
public class SplitInOddsAndEvenElementsOfAnArray {
    private SplitInOddsAndEvenElementsOfAnArray () {}

    public static int[][] oddsAndEven(int[] myArray) {
        int[][] oddsAndEvenMatrix = new int[2][3];
        int j = 0, k=0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                oddsAndEvenMatrix[0][j] = myArray[i];
                j++;
            } else {
                oddsAndEvenMatrix[1][k] = myArray[i];
                k++;
            }
        }
        return oddsAndEvenMatrix;
    }
}
