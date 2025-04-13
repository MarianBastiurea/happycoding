package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class LongestSubstringBetweenTwoSameCharactersTest {
    @Test
     void pickOutTheLongestSubstring() {
        String myString = "pickOutTheLongestSubstring";
        String resultString = "ickOutTheLongestSubstr";
        String result = LongestSubstringBetweenTwoSameCharacters.findLongestSubstring(myString);
        assertEquals(result, resultString);
    }

    @Test
void substringuti() {
        String myString = "substringuti";
        String resultString = "ubstring";
        String result = LongestSubstringBetweenTwoSameCharacters.findLongestSubstring(myString);
        assertEquals(result, resultString);
    }
}
