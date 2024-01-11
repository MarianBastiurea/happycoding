package org.example.c03arrays.sort;

/*
Write a Java program to sort a list of elements using the quick sort algorithm. >
 */
public class QuickSort {
    public static int[] quickSort(int[] myArray) {
        int N = myArray.length;
        sortArray(myArray, 0, N - 1);
        return myArray;
    }

    static void swapElements(int[] myArray, int i, int j) {
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    /*This algorithm  takes last element of myArray as pivot,
    places the pivot element at its correct position
    in sorted myArray, and places all smaller to left
    of pivot and all greater elements to right of pivot*/
    static int partition(int[] myArray, int firstElement, int lastElement) {
        int pivot = myArray[lastElement];
        int i = (firstElement - 1);
        for (int j = firstElement; j <= lastElement - 1; j++) {
            if (myArray[j] < pivot) {
                i++;
                swapElements(myArray, i, j);
            }
        }
        swapElements(myArray, i + 1, lastElement);
        return (i + 1);
    }

    static void sortArray(int[] myArray, int firstElement, int lastElement) {
        if (firstElement < lastElement) {
            int partitionIndex = partition(myArray, firstElement, lastElement);

            /* Separately sort elements before
             partition and after partition*/
            sortArray(myArray, firstElement, partitionIndex - 1);
            sortArray(myArray, partitionIndex + 1, lastElement);
        }
    }
}
