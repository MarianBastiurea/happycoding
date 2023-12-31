package org.example.c05searchingandsorting;

/*
Write a Java program to find the position of a target value within a sorted array using binary search.
 */
public class BinarySearch {
    public static int FindPosition(int[] myArray, int Target) {
        int middlePosition = myArray.length / 2;
        int position = 0;
        int firstPosition = 0;
        int lastPosition = myArray.length - 1;
        while (firstPosition <= lastPosition) {
            if (myArray[middlePosition] < Target) {
                firstPosition = middlePosition + 1;
            } else if (myArray[middlePosition] == Target) {
                position = middlePosition;
                break;
            } else {
                lastPosition = middlePosition - 1;
            }
            middlePosition = (firstPosition + lastPosition) / 2;
        }
        return position;
    }
}
