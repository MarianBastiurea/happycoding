package com.marianbastiurea.c04matrices.verify;

/*
Write a program in Java to accept two matrices and check whether they are equal.
 */
public class CheckIfTwoMatrixAreEquals {
    private CheckIfTwoMatrixAreEquals() {
    }

    public static boolean checkTwoMatrix(int[][] matrix1, int[][] matrix2) {
        // Check if matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        // Check element-wise equality
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

