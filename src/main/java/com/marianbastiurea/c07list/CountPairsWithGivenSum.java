package com.marianbastiurea.c07list;

import java.util.HashMap;
import java.util.Map;

/*
📝 Description:

Given an array of integers nums and an integer target, write a function to count the number of distinct pairs (i, j) such that nums[i] + nums[j] == target, and i < j.

🔧 Input:

An array nums of length n where 1 ≤ n ≤ 10⁵ and -10⁹ ≤ nums[i] ≤ 10⁹.
An integer target (-10⁹ ≤ target ≤ 10⁹).
🧾 Output:

Return an integer representing the number of unique pairs that sum up to target.

 */
public class CountPairsWithGivenSum {

    public static int countPairs(int[] myArray, int target){
        Map<Integer, Integer> seen = new HashMap<>();
        int count = 0;

        for (int number : myArray) {
            int complement = target - number;
            if (seen.containsKey(complement)) {
                count += seen.get(complement);
            }
            seen.put(number, seen.getOrDefault(number, 0) + 1);
        }

        return count;
    }
}
