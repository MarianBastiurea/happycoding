package org.example;

import java.util.Arrays;

public class C05P11SortInAscendingOrderElementsOfArray {
    public int[] SortInAscendingOrder(int[] myArray){
        int temp;
        for (int i=0;i<4;i++) {
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i + 1];
                myArray[i + 1] = myArray[i];
                myArray[i] = temp;
            }
        }
        return myArray;
    }
}
