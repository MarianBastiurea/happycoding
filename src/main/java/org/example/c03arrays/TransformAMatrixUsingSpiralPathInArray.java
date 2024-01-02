package org.example.c03arrays;

/*
Write a program in Java to print a matrix in spiral form.
Expected Output :
The given array in matrix form is :
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
The spiral form of above matrix is:
1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12
 */
public class TransformAMatrixUsingSpiralPathInArray {
    public static int[] TransformAMatrix(int[][] myMatrix) {
        int[] Result = new int[myMatrix.length * myMatrix[0].length];
        int ICountUp = 0;
        int ICountDown = 0;
        int JCountLeft = 0;
        int JCountRight = 0;
        int k = 0;
        int rows = myMatrix.length;
        int columns = myMatrix[0].length;
        // take element from first line and count it
        while (k < Result.length) {
            for (int j = JCountLeft; j < columns - JCountRight; j++) {
                Result[k] = myMatrix[ICountUp][j];
                k++;
            }
            ICountUp++;
// take element from last right column and count it
            for (int i = ICountUp; i < rows - ICountDown; i++) {
                Result[k] = myMatrix[i][columns - JCountRight - 1];
                k++;
            }
            JCountRight++;
// take element from bottom line and count it
            for (int m = columns - JCountRight - 1; m >= JCountLeft; m--) {
                Result[k] = myMatrix[rows - ICountDown - 1][m];
                k++;
            }
            ICountDown++;
// take element from left end column and count it
            for (int n = rows - ICountDown - 1; n >= ICountUp; n--) {
                Result[k] = myMatrix[n][JCountLeft];
                k++;
            }
            JCountLeft++;
        }
        return Result;
    }
}
