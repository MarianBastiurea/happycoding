package org.example.c03arrays;

/*
Write a program in Java to accept two matrices and check whether they are equal.
 */
public class CheckIfTwoMatrixAreEquals {
    public static boolean checkTwoMatrix(int[][] FirstMatrix, int[][] SecondMatrix) {
        for (int i = 0; i < FirstMatrix[0].length; i++) {
            for (int j = 0; j < FirstMatrix.length; j++) {
                if (FirstMatrix[i][j] != SecondMatrix[i][j]) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }
}
