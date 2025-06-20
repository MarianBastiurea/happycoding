package com.marianbastiurea.c07list;

/*
Description:

Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
You need to solve this in O(n) time.

Constraints:
You must use a solution with linear time complexity (O(n)), which means no nested loops allowed.
You may use a HashMap to store prefix sums and their frequencies.

 */

import java.util.HashMap;

public class SubArraySumEqualsK {

    public static int subArraySum(int[] myArray, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        int currentSum = 0;
        int count = 0;
        for (int num : myArray) {
            currentSum += num;
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }

}
