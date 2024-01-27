package org.example.c03arrays.insert;

/*
Write a program in Java to insert values in the array (unsorted list).
 */
public class InsertElementAtPositionInArray {
    private InsertElementAtPositionInArray () {}

    public static int[] insertElementAtPosition(int[] array, int newElement, int position) {
        int LengthOfResultArray = array.length + 1;
        int temp;
        int[] resultArray = new int[LengthOfResultArray];

        // first we have to sort myArray
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // now, we insert new element in sorted array
        for (int i = 0; i < LengthOfResultArray; i++) {
            if (i < position)
                resultArray[i] = array[i];
            else if (i == position)
                resultArray[i] = newElement;
            else
                resultArray[i] = array[i - 1];
        }
        return resultArray;
    }
}
