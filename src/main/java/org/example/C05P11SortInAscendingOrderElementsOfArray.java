package org.example;

public class C05P11SortInAscendingOrderElementsOfArray {
    public static int[] SortInAscendingOrder(int[] myArray) {
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }
}
