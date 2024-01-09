package org.example.c03arrays;

/*
Write a program in Java to delete an element at a desired position from an array.
*/

public class DeleteAnElementInDesiredPositionInAnArray {
    public static int[] deleteElementAtPosition(int[] array, int position) {
        int LengthOfResultArray = array.length - 1;
        int[] resultArray = new int[LengthOfResultArray];
        for (int i = 0; i < LengthOfResultArray; i++) {
            if (i < position)
                resultArray[i] = array[i];
            else
                resultArray[i] = array[i + 1];
        }
        return resultArray;
    }
}
