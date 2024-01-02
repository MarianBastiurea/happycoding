package org.example.c03arrays;
/*
Write a program in Java to find the two repeating elements in a given array.
 */
public class FindTwoRepeatingElementsInAnArray {
    public static int[] FindTwo(int[] myArray) {
        int[] resultArray = new int[2];
        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    resultArray[k] = myArray[i];
                    k++;
                    if (k == 2) {
                        i = myArray.length;
                        j = myArray.length;
                    }
                    break;
                }
            }
        }
        return resultArray;
    }
}
