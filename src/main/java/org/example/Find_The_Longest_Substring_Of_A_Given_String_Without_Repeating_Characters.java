package org.example;

public class Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters {
    public static String FindTheLongest(String myString){
        //if myString is null return ""
        if (myString == null || myString.length() == 0) {
            return "";
        }

        int k = myString.length();
        int start = 0, end = 0;
        int maxLength = 0;
        int maxStart = 0;

    // Length off array is number of ASCII characters
        int[] characterIndex = new int[128];

        // Initialize all indices to -1
        for (int i = 0; i < characterIndex.length; i++) {
            characterIndex[i] = -1;
        }

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
