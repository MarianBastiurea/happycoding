package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Find_The_Longest_Substring_Between_Two_Same_Characters_Test {
    @Test
    public void pickOutTheLongestSubstring() {
        String myString = "pickOutTheLongestSubstring";
        String resultString = "ickOutTheLongestSubstr";
        String result = Find_The_Longest_Substring_Between_Two_Same_Characters.FindLongestSubstring(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void substringuti() {
        String myString="substringuti";
        String resultString = "ubstring";
        String result = Find_The_Longest_Substring_Between_Two_Same_Characters.FindLongestSubstring(myString);
        assertEquals(result, resultString);
    }
}
