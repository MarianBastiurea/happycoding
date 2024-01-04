package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheLongestSubstringBetweenTwoSameCharactersTest {
    @Test
    public void pickOutTheLongestSubstring() {
        String myString = "pickOutTheLongestSubstring";
        String resultString = "ickOutTheLongestSubstr";
        String result = FindTheLongestSubstringBetweenTwoSameCharacters.FindLongestSubstring(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void substringuti() {
        String myString="substringuti";
        String resultString = "ubstring";
        String result = FindTheLongestSubstringBetweenTwoSameCharacters.FindLongestSubstring(myString);
        assertEquals(result, resultString);
    }
}
