package com.marianbastiurea.c07list;


import java.util.HashMap;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive
elements sequence.

You must write an algorithm that runs in O(n) time.

 */
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] myArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int num : myArray) {
            if (!map.containsKey(num)) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int totalLength = left + right + 1;
                map.put(num, totalLength);
                map.put(num - left, totalLength);
                map.put(num + right, totalLength);
                maxLength = Math.max(maxLength, totalLength);
            }
        }
        return maxLength;
    }

}
