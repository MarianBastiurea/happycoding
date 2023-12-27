package org.example;

/*
https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-20.php

Write a program in C for the subtraction of two matrices.
Test Data :
Input the size of the square matrix (less than 5): 2
Input elements in the first matrix :
element - [0],[0] : 5
element - [0],[1] : 6
element - [1],[0] : 7
element - [1],[1] : 8
Input elements in the second matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Expected Output :
The First matrix is :

5 6
7 8
The Second matrix is :

1 2
3 4
The Subtraction of two matrix is :

4 4
4 4
 */
public class C05P20MaticesSubtraction {
    public static int[][] subtract(int[][] firstMatrix, int[][] secondMatrix) {
        int rows, columns;
        if (firstMatrix.length > secondMatrix.length) {
            columns = firstMatrix.length;
        } else {
            columns = secondMatrix.length;
        }
        if (firstMatrix[0].length > secondMatrix[0].length) {
            rows = firstMatrix[0].length;
        } else {
            rows = secondMatrix[0].length;
        }
        int[][] result = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        return result;
    }
}
