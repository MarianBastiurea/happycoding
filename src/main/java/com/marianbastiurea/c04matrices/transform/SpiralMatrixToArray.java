package com.marianbastiurea.c04matrices.transform;

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
public class SpiralMatrixToArray {
    private SpiralMatrixToArray() {
    }

    public static int[] transformAMatrix(int[][] myMatrix) {
        int[] result = new int[myMatrix.length * myMatrix[0].length];
        int upPadding = 0;
        int downPadding = 0;
        int leftPadding = 0;
        int rightPadding = 0;
        int k = 0;
        int rows = myMatrix.length;
        int columns = myMatrix[0].length;
        // take element from first line and count it
        while (k < result.length) {
            for (int i = leftPadding; i < columns - rightPadding; i++) {
                result[k] = myMatrix[upPadding][i];
                k++;
            }
            upPadding++;
            // take element from last right column and count it
            for (int i = upPadding; i < rows - downPadding; i++) {
                result[k] = myMatrix[i][columns - rightPadding - 1];
                k++;
            }
            rightPadding++;
            // take element from bottom line and count it
            for (int i = columns - rightPadding - 1; i >= leftPadding; i--) {
                result[k] = myMatrix[rows - downPadding - 1][i];
                k++;
            }
            downPadding++;
            // take element from left end column and count it
            for (int i = rows - downPadding - 1; i >= upPadding; i--) {
                result[k] = myMatrix[i][leftPadding];
                k++;
            }
            leftPadding++;
        }
        return result;
    }
}
