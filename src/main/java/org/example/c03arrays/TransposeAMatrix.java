package org.example.c03arrays;

/*
Write a program in Java to find the transpose of a given matrix.
 */
public class TransposeAMatrix {
    public static int[][] TransposeAMatrix(int[][] myMatrix) {
        int rows = myMatrix.length;
        int columns = myMatrix[0].length;
        int[][] MatrixTransposed = new int[columns][rows];
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                MatrixTransposed[i][j] = myMatrix[j][i];
            }
        }
        return MatrixTransposed;
    }
}
