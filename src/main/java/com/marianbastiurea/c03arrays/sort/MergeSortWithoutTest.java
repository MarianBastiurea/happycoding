package com.marianbastiurea.c03arrays.sort;

import java.util.Arrays;

public class MergeSortWithoutTest {

    public static int[] mergeSort(int[] myArray) {
        int length1=myArray.length / 2;
        int length2= myArray.length-length1;

        int[] firstHalf = new int[length1];
        int[] secondHalf = new int[length2];

        for (int i = 0; i < length1; i++) {
            firstHalf[i] = myArray[i];
        }
        System.out.println("this is firstHalf array: "+Arrays.toString(firstHalf));

        for (int i = 0; i < length2; i++) {
            secondHalf[i] = myArray[i+ length1];
        }
        System.out.println("this is secondHalf array: "+Arrays.toString(secondHalf));

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length1 - 1; j++) {
                if (firstHalf[j] > firstHalf[j + 1]) {
                    int temp = firstHalf[j + 1];
                    firstHalf[j + 1] = firstHalf[j];
                    firstHalf[j] = temp;
                }
            }
        }

        for (int i = 0; i < length2; i++) {
            for (int j = 0; j < length2 - 1; j++) {
                if (secondHalf[j] > secondHalf[j + 1]) {
                    int temp = secondHalf[j + 1];
                    secondHalf[j + 1] = secondHalf[j];
                    secondHalf[j] = temp;
                }
            }
        }

        int i=0;
        int j=0;
        int k=0;

        while(i<length1 && j<length2) {
            if(firstHalf[i]<=secondHalf[j]){
                myArray[k]=firstHalf[i];
                i++;
            }else{
                myArray[k]=secondHalf[j];
                j++;
            }
            k++;
        }
        while(i< firstHalf.length){
            myArray[k]=firstHalf[i];
            i++;
            k++;
        }
        while (j< secondHalf.length){
            myArray[k]=secondHalf[j];
            i++;
            j++;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray={-1,4,2,9,0,10,-9,4,5};
        System.out.println("This is array sorted: "+ Arrays.toString(mergeSort(myArray)));
    }

}
