package org.example.c03arrays;

/*
Write a program in Java to insert values in the array (unsorted list).
 */
public class InsertAnewElementInaPositionInArray {
    public static int[] InsertElement(int[] myArray, int elementToBeInserted, int positionToInsertNewElement) {
        int LengthOfResultArray = myArray.length + 1;
        int temp = 0;
        int[] resultArray = new int[LengthOfResultArray];

        // first we have to sort myArray
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        // now, we insert new element in sorted array
        for (int i = 0; i < LengthOfResultArray; i++) {
            if (i < positionToInsertNewElement)
                resultArray[i] = myArray[i];
            else if (i == positionToInsertNewElement)
                resultArray[i] = elementToBeInserted;
            else
                resultArray[i] = myArray[i - 1];
        }
        return resultArray;
    }

}
