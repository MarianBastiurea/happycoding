package com.marianbastiurea.c07list;

/*
📝 Description:

Given a string s, return the index of the first non-repeating character in it. If there is no such character, return -1.

🔧 Input:

A string s consisting of lowercase English letters, 1 ≤ s.length ≤ 10⁵.
🧾 Output:

An integer – the index of the first unique (non-repeating) character.
💡 Hint:

Use a HashMap<Character, Integer> to count the frequency of each character.
Then, do a second pass through the string to find the first character with frequency 1.
 */


import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public static int firstUnique(String myString) {

        int position = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < myString.length(); i++) {
            if (map.get(myString.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}


