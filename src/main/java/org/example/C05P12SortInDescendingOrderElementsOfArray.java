package org.example;

public class C05P12SortInDescendingOrderElementsOfArray {
    public static int[] SortInDescendingOrder(int[] myArray) {
            int[] resultArray = new int[myArray.length];
        int temp = 0;
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

