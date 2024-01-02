package org.example.c03arrays;

/*
Write a program in Java to print or display an upper triangular matrix.
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

Setting zero in upper triangular matrix

1 0 0
4 5 0
7 8 9
 */
public class ChangeElementsInUpperTriangularOfAMatrix {
    public static int[][] ChangeElements(int[][] myMatrix) {
        int[][] resultMatrix = new int[myMatrix[0].length][myMatrix.length];
        for (int i = 0; i < myMatrix[0].length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                if (i == myMatrix[0].length - 1) {
                    resultMatrix[i][j] = myMatrix[i][j];
                }
                if (j > i) {
                    resultMatrix[i][j] = 0;
                } else {
                    resultMatrix[i][j] = myMatrix[i][j];
                }
            }
        }
        return resultMatrix;
    }
}
