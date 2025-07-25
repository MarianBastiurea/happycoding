package com.marianbastiurea.c07list;

/*
Given an integer array  (which may contain duplicates), write a program that:

Groups all equal values together.
Sorts the groups in descending order of frequency (i.e., number of occurrences).
If two numbers have the same frequency, they should appear in ascending numerical order.
🔹 Example:

Input:  myArray = [4, 5, 6, 5, 4, 3]
Output: [5, 5, 4, 4, 3, 6]

Explanation:
- Frequencies: 5 → 2, 4 → 2, 6 → 1, 3 → 1
- 5 and 4 appear most frequently (2 times each) → they are sorted by value: 4, 5
- Since we want descending frequency and ascending value for equal frequencies, 5 comes before 4 in final array.
- 3 and 6 appear once → 3 < 6 → 3 appears before 6.
🔹 Requirement: Return a new array sorted according to the above rules.

🔍 Constraints:
1 ≤ myArray.length ≤ 10^4
-10^5 ≤ myArray[i] ≤ 10^5
Expected complexity: O(n log n)
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAndSortByFrequency {

    public static int[] groupAndSort(int[] myArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : myArray) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        List<Integer> uniqueValues = new ArrayList<>(map.keySet());

        uniqueValues.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            } else {
                return Integer.compare(a, b);
            }
        });

        List<Integer> resultList = new ArrayList<>();
        for (int num : uniqueValues) {
            int freq = map.get(num);
            for (int i = 0; i < freq; i++) {
                resultList.add(num);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
