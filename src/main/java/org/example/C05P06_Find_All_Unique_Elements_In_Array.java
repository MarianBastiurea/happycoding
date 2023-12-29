package org.example;

/* Write a program in C to print all unique elements in an array.

https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-6.php
 */

public class C05P06_Find_All_Unique_Elements_In_Array {
    public static int[] uniqueElement(int[] myArray) {
        int[] allUniqueElements = new int[myArray.length];
        int indexAllUniqueElements = 0;
        int len = myArray.length;
        for (int i = 0; i < len; i++) {
            int b = 0;
            for (int j = 0; j < len; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                allUniqueElements[indexAllUniqueElements] = myArray[i];
                indexAllUniqueElements++;
            }
        }
        return allUniqueElements;
    }
}
