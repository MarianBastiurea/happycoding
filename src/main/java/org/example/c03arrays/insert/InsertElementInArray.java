package org.example.c03arrays.insert;

/*
Write a program in Java to insert the values in the array (sorted list).
 */
public class InsertElementInArray {
    public static int[] insertElements(int[] myArray, int element) {
        int[] resultArray = new int[myArray.length + 1];
        int position = 0;
        //Find position where new element will be inserted
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < element) {
                position = i + 1;
            }
        }
        for (int j = 0; j < resultArray.length; j++) {
            if (j < position)
                resultArray[j] = myArray[j];
            else if (j == position)
                resultArray[j] = element;
            else resultArray[j] = myArray[j - 1];

        }
        return resultArray;
    }
}
