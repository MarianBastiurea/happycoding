package com.marianbastiurea.c03arrays.calculate;

/*
Write a program in Java to find a pair with given sum in the array.
 */
public class FindPairOfElementsOfAnArrayWithGivenSum {
    private FindPairOfElementsOfAnArrayWithGivenSum() {
    }

    public static int[][] findPair(int[] myArray, int sum) {
        int k = 0;
        int temporaryLength = myArray.length * myArray.length;
        int[][] temporaryMatrix = new int[temporaryLength][2];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == sum) {
                    temporaryMatrix[k][0] = myArray[i];
                    temporaryMatrix[k][1] = myArray[j];
                    k++;
                }
            }
        }
        int[][] resultMatrix = new int[k][2];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= 1; j++) {
                resultMatrix[i][j] = temporaryMatrix[i][j];
            }
        }
        return resultMatrix;
    }
}
