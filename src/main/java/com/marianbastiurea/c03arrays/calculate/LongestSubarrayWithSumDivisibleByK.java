package com.marianbastiurea.c03arrays.calculate;

/*
Problem Title: Longest Subarray with Sum Divisible by K

Description:

You are given an array of integers nums and an integer k.
Your task is to find the length of the longest contiguous subarray such that the sum of its elements is divisible by k.

If no such subarray exists, return 0.

Input:

An array of integers nums of length n (1 ≤ n ≤ 10⁵)
An integer k (1 ≤ k ≤ 10⁴)
Output:

An integer representing the length of the longest contiguous subarray whose sum is divisible by k.

 */

public class LongestSubarrayWithSumDivisibleByK {
    public static int findLength(int[] myArray, int k) {
        int length = 0;
        int position = 0;
        int[] subArray = new int[myArray.length * 10];
        for (int i = 0; i < myArray.length; i++) {
            int sum = 0;
            int x = 0;
            do {
                for (int j = x; j <= i; j++) {
                    sum += myArray[j];
                    if (sum % k == 0) {
                        subArray[position] = j - x + 1;
                        position++;
                    }
                }
                x++;
                sum = 0;
            } while (x <= i);
        }
        for (int i = 0; i < subArray.length - 1; i++) {

            if (length < subArray[i]) {
                length = subArray[i];
            }
        }
        return length;
    }
}
