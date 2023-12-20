package org.example;

public class C07P04_Sorting_An_Array_Using_The_Merge_Sort_Algorithm {
    public static int[] SortingUsingMergeSortingAlgorithm(int[] myArray) {
        int m = myArray.length / 2;// Find middle of array
        int[] resultArray = new int[myArray.length];// myArray sorted
        int[] leftArray = new int[m];//left half of original array
        int[] rightArray = new int[myArray.length - m];// right half of original array
        for (int i = 0; i < m; i++) {
            leftArray[i] = myArray[i];
        }
        for (int j = 0; j < myArray.length - m; j++) {
            rightArray[j] = myArray[j + m];
        }
        sortArray(leftArray);// sorting method used to sort each half of original array
        sortArray(rightArray);
        int i = 0, j = 0, k = 0;
        //merge left and right half of original array
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                resultArray[k] = leftArray[i];
                i++;
            } else {
                resultArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // copying remaining elements of each half arrays
        while (i < leftArray.length) {
            resultArray[k] = leftArray[i];
            k++;
            i++;
        }
        while (j < rightArray.length) {
            resultArray[k] = rightArray[i];
            k++;
            j++;
        }
        return resultArray;
    }

    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int k = 0; k < array.length; k++) {
            for (int l = k + 1; l < array.length; l++) {
                if (array[k] > array[l]) {
                    temp = array[k];
                    array[k] = array[l];
                    array[l] = temp;
                }
            }
        }
        return array;
    }
}

