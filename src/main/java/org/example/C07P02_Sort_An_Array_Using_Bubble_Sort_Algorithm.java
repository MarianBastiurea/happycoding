package org.example;

public class C07P02_Sort_An_Array_Using_Bubble_Sort_Algorithm {
    public static int[] SortArrayUsingBubbleSort(int[] myArray){
        int temp=0;
        for(int j=0; j<myArray.length-1;j++) {
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] < myArray[i + 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
        }
return myArray;
    }
}
