package org.example.c03arrays;

/*
Write a program in Java for adding two matrices of the same size.
 */
public class AddingTwoMatricesOfTheSameSize {
    public static int[][] AddingTwoMatrices(int[][] FirstMatrices, int[][] SecondMatrices) {
        int[][] AddTwoMatrices = new int[FirstMatrices.length][FirstMatrices.length];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                AddTwoMatrices[i][j] = FirstMatrices[i][j] + SecondMatrices[i][j];
            }
        }
        return AddTwoMatrices;
    }
}
