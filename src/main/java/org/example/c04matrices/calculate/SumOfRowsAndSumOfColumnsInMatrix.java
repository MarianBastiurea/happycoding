package org.example.c04matrices.calculate;

/*
Write a program in Java to find the sum of rows and columns of a matrix.
 */
public class SumOfRowsAndSumOfColumnsInMatrix {
    public static int[][] sumInMatrix(int[][] myMatrix) {
        int[] sumOfRowsOfMatrix = new int[myMatrix[0].length];
        int[] sumOfColumnsOfMatrix = new int[myMatrix.length];
        int[][] sumMatrix = new int[2][myMatrix.length];
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                sumOfRowsOfMatrix[i] = sumOfRowsOfMatrix[i] + myMatrix[i][j];
            }
        }
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                sumOfColumnsOfMatrix[j] = sumOfColumnsOfMatrix[j] + myMatrix[i][j];
            }
        }
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                if (i == 0) {
                    sumMatrix[i][j] = sumOfRowsOfMatrix[j];
                } else {
                    sumMatrix[i][j] = sumOfColumnsOfMatrix[j];
                }
            }
        }
        return sumMatrix;
    }
}
