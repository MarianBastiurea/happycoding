package com.marianbastiurea.c02controlflow.calculate;
import java.util.Arrays;

public class LongestSubstringOfAGivenStringWithoutRepeatingCharacters {
    private LongestSubstringOfAGivenStringWithoutRepeatingCharacters () {}

    public static String FindTheLongest(String myString){
        //if myString is null return ""
        if (myString == null || myString.isEmpty()) {
            return "";
        }
        int k = myString.length();
        int start = 0, end = 0, maxLength = 0, maxStart = 0;

    // Length off array is number of ASCII characters
        int[] characterIndex = new int[128];

        // Initialize all indices to -1
        Arrays.fill(characterIndex, -1);
        while (end < k) {
            char currentCharacter = myString.charAt(end);
            if (characterIndex[currentCharacter] != -1) {
                start = Math.max(characterIndex[currentCharacter] + 1, start);
            }
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
            characterIndex[currentCharacter] = end;
            end++;
        }
        return myString.substring(maxStart, maxStart + maxLength);
    }
}
