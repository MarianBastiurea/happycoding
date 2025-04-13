package com.marianbastiurea.c04matrices.transform;

/*
Write a program in Java to print or display the lower triangular of a given matrix.
Test Data :
Input the size of the square matrix : 3
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [0],[2] : 3
element - [1],[0] : 4
element - [1],[1] : 5
element - [1],[2] : 6
element - [2],[0] : 7
element - [2],[1] : 8
element - [2],[2] : 9
Expected Output :
The matrix is :
1 2 3
4 5 6
7 8 9

Setting zero in lower triangular matrix

1 2 3
0 5 6
0 0 9
 */
public class ChangeElementsInLowerTriangularOfAMatrix {
    private ChangeElementsInLowerTriangularOfAMatrix() {
    }

    public static int[][] changeElements(int[][] matrix) {
        int[][] resultMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0) {
                    resultMatrix[i][j] = matrix[i][j];
                }
                if (j < i) {
                    resultMatrix[i][j] = 0;
                } else {
                    resultMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return resultMatrix;
    }
}
