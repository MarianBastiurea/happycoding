package org.example.c03arrays;

/*
Write a program in Java to insert the values in the array (sorted list).
 */
public class InsertANewElementInArray {
    public static int[] InsertElements(int[] myArray, int elementToBeInserted) {
        int[] resultArray = new int[myArray.length + 1];
        int positionWhereElementWillBeInserted = 0;
        //Find position where new element will be inserted
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < elementToBeInserted) {
                positionWhereElementWillBeInserted = i + 1;
            }
        }
        for (int j = 0; j < resultArray.length; j++) {
            if (j < positionWhereElementWillBeInserted)
                resultArray[j] = myArray[j];
            else if (j == positionWhereElementWillBeInserted)
                resultArray[j] = elementToBeInserted;
            else resultArray[j] = myArray[j - 1];

        }
        return resultArray;
    }
}
