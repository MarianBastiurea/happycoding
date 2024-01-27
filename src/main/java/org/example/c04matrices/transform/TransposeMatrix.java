package org.example.c04matrices.transform;

/*
Write a program in Java to find the transpose of a given matrix.
 */
public class TransposeMatrix {
    private TransposeMatrix () {}

    public static int[][] transposeAMatrix(int[][] myMatrix) {
        int rows = myMatrix.length;
        int columns = myMatrix[0].length;
        int[][] matrixTransposed = new int[columns][rows];
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                matrixTransposed[i][j] = myMatrix[j][i];
            }
        }
        return matrixTransposed;
    }
}
