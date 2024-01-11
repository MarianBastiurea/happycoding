package org.example.c04matrices.calculate;

/*
Write a program in Java to find the sum of the right diagonals of a matrix.
 */
public class SumOfRightDiagonalInMatrix {
    public static int sumOfDiagonal(int[][] myMatrix) {
        int sum = 0;
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                if (i == j) {
                    sum = sum + myMatrix[i][j];
                }
            }
        }
        return sum;
    }
}
