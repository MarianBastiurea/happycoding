package org.example;

public class C07P06_Sort_An_Array_Using_Quick_Sort_Algorithm {
    public static int[] QuickSort(int[] myArray) {
        int N = myArray.length;
        SortArray(myArray, 0, N - 1);
        System.out.println("temporaryArray is: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
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

    static void SortArray(int[] myArray, int firstElement, int lastElement) {
        if (firstElement < lastElement) {
            int partitionIndex = partition(myArray, firstElement, lastElement);

            /* Separately sort elements before
             partition and after partition*/
            SortArray(myArray, firstElement, partitionIndex - 1);
            SortArray(myArray, partitionIndex + 1, lastElement);
        }
    }
}
