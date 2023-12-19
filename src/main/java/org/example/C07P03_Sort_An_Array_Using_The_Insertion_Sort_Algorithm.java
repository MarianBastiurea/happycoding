package org.example;

public class C07P03_Sort_An_Array_Using_The_Insertion_Sort_Algorithm {
    public static int[] SortUsingInsertion(int[] myArray){
        for (int i = 1; i < myArray.length; ++i) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = key;
        }
        return myArray;
    }
}
