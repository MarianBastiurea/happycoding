package org.example.c03arrays;

/*
Write a program in Java to find the second largest element in an array.
 */
public class FindTheSecondLargestElementInArray {
    public static int FindSecondLargestElementInArray(int[] myArray) {
        int result;
        int temp;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        result = myArray[myArray.length - 2];
        return result;
    }
}
