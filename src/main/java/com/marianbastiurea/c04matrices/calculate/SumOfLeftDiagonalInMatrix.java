package com.marianbastiurea.c04matrices.calculate;

/*
Write a program in Java to find the sum of the left diagonals of a matrix.
*/
public class SumOfLeftDiagonalInMatrix {
    private SumOfLeftDiagonalInMatrix() {
    }

    public static int sumOfDiagonal(int[][] myMatrix) {
        int sum = 0;
        int decrement = myMatrix.length - 1;
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = myMatrix.length - 1; j >= 0; j--) {
                if (j == decrement) {
                    sum = sum + myMatrix[i][j];
                }
            }
            decrement = decrement - 1;
        }
        return sum;
    }
}
