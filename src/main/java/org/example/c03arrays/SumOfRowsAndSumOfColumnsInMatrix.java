package org.example.c03arrays;

/*
Write a program in Java to find the sum of rows and columns of a matrix.
 */
public class SumOfRowsAndSumOfColumnsInMatrix {
    public static int[][] SumInMatrix(int[][] myMatrix) {
        int[] Sum_Of_Rows_Of_Matrix = new int[myMatrix[0].length];
        int[] Sum_Of_Columns_Of_Matrix = new int[myMatrix.length];
        int[][] Sum_Matrix = new int[2][myMatrix.length];
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                Sum_Of_Rows_Of_Matrix[i] = Sum_Of_Rows_Of_Matrix[i] + myMatrix[i][j];
            }
        }
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                Sum_Of_Columns_Of_Matrix[j] = Sum_Of_Columns_Of_Matrix[j] + myMatrix[i][j];
            }
        }
        for (int i = 0; i < Sum_Matrix.length; i++) {
            for (int j = 0; j < Sum_Matrix[i].length; j++) {
                if (i == 0) {
                    Sum_Matrix[i][j] = Sum_Of_Rows_Of_Matrix[j];
                } else {
                    Sum_Matrix[i][j] = Sum_Of_Columns_Of_Matrix[j];
                }
            }
        }
        return Sum_Matrix;
    }
}
