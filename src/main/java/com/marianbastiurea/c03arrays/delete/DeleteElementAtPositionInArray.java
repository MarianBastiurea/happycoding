package com.marianbastiurea.c03arrays.delete;

/*
Write a program in Java to delete an element at a desired position from an array.
*/

public class DeleteElementAtPositionInArray {
    private DeleteElementAtPositionInArray () {}

    public static int[] deleteElementAtPosition(int[] array, int position) {
        int lengthOfResultArray = array.length - 1;
        int[] resultArray = new int[lengthOfResultArray];
        for (int i = 0; i < lengthOfResultArray; i++) {
            if (i < position)
                resultArray[i] = array[i];
            else
                resultArray[i] = array[i + 1];
        }
        return resultArray;
    }
}
