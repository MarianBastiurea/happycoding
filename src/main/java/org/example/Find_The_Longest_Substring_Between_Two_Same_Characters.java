package org.example;

public class Find_The_Longest_Substring_Between_Two_Same_Characters {
    public static String FindLongestSubstring(String myString) {
        // define a matrix where we store repeating element and distance between them
        int[][] LongestSubstring = new int[myString.length()][2];

        // count position of LongestSubstring where we store data.
        int k = 0;

        // create matrix where will store repeating element and distance between them
        for (int i = 0; i < myString.length(); i++) {
            for (int j = i + 1; j < myString.length(); j++) {
                if (myString.charAt(i) == myString.charAt(j)) {
                    LongestSubstring[k][0] = i;
                    LongestSubstring[k][1] = j - i + 1;
                    k++;
                }
            }
        }

        // define two temporary values to store first position of repeating element and
        // distance to second repeating  element
        int tempI = 0, tempJ = 0;

        // Find the biggest distance between two same elements
        // will be the last row in matrix
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (LongestSubstring[i][1] > LongestSubstring[j][1]) {
                    tempJ = LongestSubstring[i][1];
                    tempI = LongestSubstring[i][0];

                    LongestSubstring[i][1] = LongestSubstring[j][1];
                    LongestSubstring[i][0] = LongestSubstring[j][0];

                    LongestSubstring[j][1] = tempJ;
                    LongestSubstring[j][0] = tempI;
                }
            }
        }
        // define two values start and end for longest substring
        int start = LongestSubstring[k - 1][0];
        int end = LongestSubstring[k - 1][1];
        String resultString = myString.substring(start, end);
        return resultString;
    }
}
