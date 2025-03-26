package com.marianbastiurea.c04matrices.calculate;

/*
Write a program in Java for the subtraction of two matrices.
 */
public class SubtractMatrices {
    private SubtractMatrices() {
    }

    public static int[][] subtract(int[][] firstMatrix, int[][] secondMatrix) {
        int rows = firstMatrix[0].length;
        int columns = firstMatrix.length;
        int[][] result = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        return result;
    }
}
