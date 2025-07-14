package com.marianbastiurea.c06challenges;

import java.util.Arrays;

    /*
    You are given an array myArray of n integers (positive, negative, or zero), and an integer d ≥ 1.

Your task is to choose a subsequence from myArray that satisfies all of the following constraints:

Any two selected elements must be at least d indices apart (i.e., if you select myArray[i] and myArray[j], then |i - j| > d).
The subsequence must contain at least one negative number.
Among all such valid subsequences:
Find one with the maximum possible sum,
And among those, return the one with the smallest width (i.e., lastIndex - firstIndex of the selected elements).
✅ Output:
Return:

The maximum sum,
The start index and end index of the optimal subsequence.
📦 Constraints:
1 ≤ myArray.length ≤ 10^5
-10^4 ≤ myArray[i] ≤ 10^4
1 ≤ d ≤ 1000
📌 Example:
myArray= [3, -1, 4, 1, -2, 5, -3], d = 1

Subsequence: [-1 (1), 4 (2), 5 (5)]
Sum: 8
Contains negative: ✅
Min width: 5 - 1 = 4

Another possibility: [-1, 5, -3] → sum = 1 → worse.

     */


public class MaxSumSparseSubsequence {

    static int[] createMatrixSum(int[] myArray, int d) {
        int[][] maxSumSubsequence = new int[myArray.length][2];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                System.out.println("we calculate sum for negative number: " + myArray[i]);
                int[] leftSum = leftPositiveSum(myArray, i, d);
                int[] rightSum = rightPositiveSum(myArray, i, d);
                maxSumSubsequence[i][1] = leftSum[1] + myArray[i] + rightSum[1];
                if (leftSum[1] == 0) {
                    maxSumSubsequence[i][0] = rightSum[0] - i;
                } else if (rightSum[1] == 0) {
                    maxSumSubsequence[i][0] = i - leftSum[0];
                } else
                    maxSumSubsequence[i][0] = rightSum[0] - leftSum[0];
            }
        }
        Arrays.sort(maxSumSubsequence, (a, b) -> Integer.compare(a[0], b[0]));
        int[] maxSumMinBandWidth = {0, 0};
        for (int[] ints : maxSumSubsequence) {
            if (ints[1] > 0) {
                maxSumMinBandWidth[1] = ints[1];
                maxSumMinBandWidth[0] = ints[0];
                break;
            }
        }
        System.out.println("max sum is= " + maxSumMinBandWidth[1]);
        System.out.println("min band width is: " + maxSumMinBandWidth[0]);
        return maxSumMinBandWidth;
    }


    static int[] leftPositiveSum(int[] myArray, int positionOfNegativeNUmber, int d) {
        int sum = 0;
        int count = 0;
        int start = 0;
        for (int i = 0; i < positionOfNegativeNUmber - d; i++) {
            if (myArray[i] > 0) {
                sum += myArray[i];
                count++;
                if (count == 1) {
                    start = i;
                }
            }
        }
        return new int[]{start, sum};
    }

    static int[] rightPositiveSum(int[] myArray, int positionOfNegativeNUmber, int d) {
        int sum = 0;
        int end = 0;
        for (int i = positionOfNegativeNUmber + d + 1; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                sum += myArray[i];
                end = i;
            }
        }
        return new int[]{end, sum};
    }
}
