package org.example.c03arrays.filter;

/*
Write a program in Java to find the two repeating elements in a given array.
 */
public class FindTwoRepeatingElementsInAnArray {
    public static int[] findRepeatingElements(int[] myArray) {
        int[] tempArray = new int[myArray.length];
        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    tempArray[k] = myArray[i];
                    k++;
                    break;
                }
            }
        }
        int[] resultArray = new int[k];
        for (int i = 0; i < k; i++) {
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }
}
