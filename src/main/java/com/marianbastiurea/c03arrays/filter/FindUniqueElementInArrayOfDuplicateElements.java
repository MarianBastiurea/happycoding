package com.marianbastiurea.c03arrays.filter;


public class FindUniqueElementInArrayOfDuplicateElements {

    public static int findUniqueElement(int[] myArray) {
        int[][] myMatrix = new int[myArray.length][2];
        int size = 0;
        for (int i = 0; i < myArray.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (myMatrix[j][0] == myArray[i]) {
                    found = true;
                    myMatrix[j][1]++;
                    break;
                }
            }
            if (!found) {
                myMatrix[size][0] = myArray[i];
                myMatrix[size][1] = 1;
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (myMatrix[i][1] == 1) {
                return myMatrix[i][0];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("unique number in array is: " + findUniqueElement(myArray));
    }

}
