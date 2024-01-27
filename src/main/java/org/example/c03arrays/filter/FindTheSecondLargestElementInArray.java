package org.example.c03arrays.filter;

/*
Write a program in Java to find the second largest element in an array.
 */
public class FindTheSecondLargestElementInArray {
    private FindTheSecondLargestElementInArray () {}

    public static int findSecondLargestElement(int[] myArray) {
        int result, temp;
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
