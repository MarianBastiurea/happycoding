package com.marianbastiurea.c02controlflow.calculate;

/*
Description:

Given an unsorted integer array nums, find the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

Input:

An array nums of length n (1 ≤ n ≤ 10⁵), where each element is an integer in the range [-10⁶, 10⁶].
Output:

Return the smallest positive integer that is not present in the array.
 */
class FindFirstMissingPositiveNumber {

    public static int firstMissingPositive(int[] myArray) {
        int n = myArray.length;

        for (int i = 0; i < n; i++) {
            while (
                    myArray[i] > 0 && myArray[i] <= n &&
                            myArray[myArray[i] - 1] != myArray[i]
            ) {
                int temp = myArray[myArray[i] - 1];
                myArray[myArray[i] - 1] = myArray[i];
                myArray[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (myArray[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }


}
