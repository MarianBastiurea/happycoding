package org.example;

public class Find_Position_Of_A_Target_Value_Within_Sorted_Array_Using_Binary_Search {
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
