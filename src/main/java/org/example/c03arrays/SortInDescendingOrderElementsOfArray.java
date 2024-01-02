package org.example.c03arrays;

/*
Write a program in Java to sort the elements of the array in descending order.
 */
public class SortInDescendingOrderElementsOfArray {
    public static int[] SortInDescendingOrder(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }
}

