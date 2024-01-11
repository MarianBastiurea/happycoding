package org.example.c04matrices.calculate;

/*
Write a program in Java for adding two matrices of the same size.
 */
public class AddingTwoMatricesOfTheSameSize {
    public static int[][] addingTwoMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] sum = new int[firstMatrix.length][firstMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }
}
