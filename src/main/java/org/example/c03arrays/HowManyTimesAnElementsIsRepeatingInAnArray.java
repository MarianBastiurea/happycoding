package org.example.c03arrays;

public class HowManyTimesAnElementsIsRepeatingInAnArray {
    public static int[][] howManyTimes(int[] myArray) {
        int k = 0; //number of unique elements which it will find number of appearance
        int count = 0; // how many times a number appears in an array
        int countZero = 0; // how many times unique number appears in first temporary matrix
        int TemporaryLength = myArray.length * myArray.length; // length of row's for first temporary matrix
        int[][] FirstTemporaryMatrix = new int[TemporaryLength][2];
        // in this matrix will count how many times number appears in array
        // no 7 appears 3 times in array and in this matrix will be {7,3}, {7,2), {7,1}

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                    FirstTemporaryMatrix[k][0] = myArray[i];
                    FirstTemporaryMatrix[k][1] = count;
                }
            }
            if (count > 0) {
                k++;
            }
            count = 0;
        }
        // Second Temporary Matrix will filter elements from First Temporary Matrix, it will
        // keep just higher value like {7,3}
        int[][] SecondTemporaryMatrix = new int[k][2];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= 1; j++) {
                SecondTemporaryMatrix[i][j] = FirstTemporaryMatrix[i][j];
            }
        }
        //rows and columns like {7,2} and {7,1} will be changed in {0,0} to be eliminated in next step
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (SecondTemporaryMatrix[i][0] == SecondTemporaryMatrix[j][0]) {
                    SecondTemporaryMatrix[j][0] = 0;
                    SecondTemporaryMatrix[j][1] = 0;
                }
            }
        }
        // count how many {0,0} it is in Second Temporary matrix
        for (int i = 0; i < k; i++) {
            if (SecondTemporaryMatrix[i][0] == 0 && SecondTemporaryMatrix[i][1] == 0) {
                countZero++;
            }

        }
        // In Result Matrix will keep just how many times a number appears in array
        int[][] resultMatrix = new int[k - countZero][2];
        int countAppearance = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= 1; j++) {
                if (SecondTemporaryMatrix[i][1] > 0) {
                    resultMatrix[countAppearance][j] = SecondTemporaryMatrix[i][j];
                }
            }
            if (resultMatrix[countAppearance][1] > 0 && k - countZero > 2) {
                countAppearance++;
            }
        }
        return resultMatrix;
    }
}
