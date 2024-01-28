package com.marianbastiurea.c02controlflow.calculate;

import com.marianbastiurea.c02controlflow.calculate.LongestSubstringBetweenTwoSameCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringBetweenTwoSameCharactersTest {
    @Test
    public void pickOutTheLongestSubstring() {
        String myString = "pickOutTheLongestSubstring";
        String resultString = "ickOutTheLongestSubstr";
        String result = LongestSubstringBetweenTwoSameCharacters.findLongestSubstring(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void substringuti() {
        String myString="substringuti";
        String resultString = "ubstring";
        String result = LongestSubstringBetweenTwoSameCharacters.findLongestSubstring(myString);
        assertEquals(result, resultString);
    }
}
