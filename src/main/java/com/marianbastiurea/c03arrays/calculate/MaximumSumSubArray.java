package com.marianbastiurea.c03arrays.calculate;

import java.util.Arrays;

public class MaximumSumSubArray {

    /*
    Given an array of integers arr, you are allowed to remove at most one element from the array.
    Your task is to return the maximum possible sum of a non-empty subarray,
    where the subArray can have at most one element deleted from the original array.
     */

    public static int findMaximumNoDelete(int[] myArray){
        int maximum=0;
        int[] noDelete= new int[myArray.length];
        int[] oneDelete=new int[myArray.length];

        for(int i=0;i< myArray.length; i++){
            for(int j=0; j<=i; j++){
                noDelete[i]+=myArray[j];
            }
        }
        for (int i : noDelete) {
            maximum = Math.max(maximum, i);
        }
        System.out.println(Arrays.toString(noDelete));


    return maximum;
    }

    public static int findMaximumOneDelete(int[] myArray, int positionToDelete){
        int maximum=0;
        myArray[positionToDelete]=0;
        int[] oneDelete=new int[myArray.length];

        for(int i=0;i< myArray.length; i++){
            for(int j=0; j<=i; j++){
                oneDelete[i]+=myArray[j];
            }
        }
        for (int i : oneDelete) {
            maximum = Math.max(maximum, i);
        }
        System.out.println(Arrays.toString(oneDelete));

        return maximum;
    }
}
