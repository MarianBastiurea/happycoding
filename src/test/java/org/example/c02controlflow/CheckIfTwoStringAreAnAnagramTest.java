package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfTwoStringAreAnAnagramTest {
    @Test
    public void twoWordsWithSameCharactersAreAnagram() {
        String firstString = "Stone";
        String secondString = "Tones";
        String resultString = "Anagram";
        String result = CheckIfTwoStringAreAnAnagram.checkAnagram(firstString, secondString);
        assertEquals(resultString, result);
    }

    @Test
    public void twoWordsWithDifferentLengthsAreNotAnagram() {
        String firstString = "Stone";
        String secondString = "Mother";
        String resultString = "Not Anagram";
        String result = CheckIfTwoStringAreAnAnagram.checkAnagram(firstString, secondString);
        assertEquals(resultString, result);
    }

    @Test
    public void twoSameLengthWordsWithDifferentCharactersAreNotAnagrams() {
        String firstString = "Change";
        String secondString = "Mother";
        String resultString = "Not Anagram";
        String result = CheckIfTwoStringAreAnAnagram.checkAnagram(firstString, secondString);
        assertEquals(resultString, result);
    }
}
