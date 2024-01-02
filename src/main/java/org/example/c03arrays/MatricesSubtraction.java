package org.example.c03arrays;

/*
Write a program in Java for the subtraction of two matrices.
 */
public class MatricesSubtraction {
    public static int[][] subtract(int[][] firstMatrix, int[][] secondMatrix) {
        int rows, columns;
        if (firstMatrix.length > secondMatrix.length) {
            columns = firstMatrix.length;
        } else {
            columns = secondMatrix.length;
        }
        if (firstMatrix[0].length > secondMatrix[0].length) {
            rows = firstMatrix[0].length;
        } else {
            rows = secondMatrix[0].length;
        }
        int[][] result = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        return result;
    }
}
