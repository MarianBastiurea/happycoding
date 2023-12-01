package org.example;

public class C05P12SortInDescendingOrderElementsOfArray {
    public int[] SortInDescendingOrder(int[] myArray){
        int temp;
        for (int i=0;i<2;i++) {
            if (myArray[i] < myArray[i + 1]) {
                temp = myArray[i+1];
                myArray[i+1] = myArray[i];
                myArray[i] = temp;
            }
        }
        return myArray;
    }
}

