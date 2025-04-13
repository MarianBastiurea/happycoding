package com.marianbastiurea.c03arrays.transform;

/*
Write a program in Java to separate odd and even integers into separate arrays.
 */
public class SplitInOddsAndEvenElementsOfAnArray {
    private SplitInOddsAndEvenElementsOfAnArray() {
    }

    public static int[][] oddsAndEven(int[] myArray) {
        int[][] oddsAndEvenMatrix = new int[2][3];
        int j = 0;
        int k = 0;
        for (int value : myArray) {
            if (value % 2 == 0) {
                oddsAndEvenMatrix[0][j] = value;
                j++;
            } else {
                oddsAndEvenMatrix[1][k] = value;
                k++;
            }
        }
        return oddsAndEvenMatrix;
    }
}
