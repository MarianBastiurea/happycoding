package com.marianbastiurea.c02controlflow.calculate;

public class LongestSubstringBetweenTwoSameCharacters {
    private LongestSubstringBetweenTwoSameCharacters() {
    }

    public static String findLongestSubstring(String inputString) {
        // define a matrix where we store repeating element and distance between them
        int[][] longestSubstring = new int[inputString.length()][2];

        // count position of LongestSubstring where we store data.
        int k = 0;

        // create matrix where will store repeating element and distance between them
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    longestSubstring[k][0] = i;
                    longestSubstring[k][1] = j - i + 1;
                    k++;
                }
            }
        }
        // define two temporary values to store first position of repeating element and
        // distance to second repeating  element
        int tempI, tempJ;

        // Find the biggest distance between two same elements
        // will be the last row in matrix
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (longestSubstring[i][1] > longestSubstring[j][1]) {
                    tempJ = longestSubstring[i][1];
                    tempI = longestSubstring[i][0];

                    longestSubstring[i][1] = longestSubstring[j][1];
                    longestSubstring[i][0] = longestSubstring[j][0];

                    longestSubstring[j][1] = tempJ;
                    longestSubstring[j][0] = tempI;
                }
            }
        }
        // define two values start and end for longest substring
        int start = longestSubstring[k - 1][0];
        int end = longestSubstring[k - 1][1];
        return inputString.substring(start, end);
    }
}
