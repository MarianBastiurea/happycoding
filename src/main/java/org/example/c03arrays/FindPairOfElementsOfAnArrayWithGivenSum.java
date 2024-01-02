package org.example.c03arrays;

/*
Write a program in Java to find a pair with given sum in the array.
 */
public class FindPairOfElementsOfAnArrayWithGivenSum {
    public static int[][] FindPair(int[] myArray, int sum) {
        int k = 0;
        int TemporaryLength = myArray.length * myArray.length;
        int[][] TemporaryMatrix = new int[TemporaryLength][2];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == sum) {
                    TemporaryMatrix[k][0] = myArray[i];
                    TemporaryMatrix[k][1] = myArray[j];
                    k++;
                }
            }
        }
        int[][] resultMatrix = new int[k][2];
        for (int l = 0; l < k; l++) {
            for (int m = 0; m <= 1; m++) {
                resultMatrix[l][m] = TemporaryMatrix[l][m];
            }
        }
        return resultMatrix;
    }
}
