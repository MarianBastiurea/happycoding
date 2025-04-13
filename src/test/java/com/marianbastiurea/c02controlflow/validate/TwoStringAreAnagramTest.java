package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TwoStringAreAnagramTest {
    @Test
     void twoWordsWithSameCharactersAreAnagram() {
        String firstString = "Stone";
        String secondString = "Tones";
        String resultString = "Anagram";
        String result = TwoStringAreAnagram.checkAnagram(firstString, secondString);
        assertEquals(resultString, result);
    }

    @Test
     void twoWordsWithDifferentLengthsAreNotAnagram() {
        String firstString = "Stone";
        String secondString = "Mother";
        String resultString = "Not Anagram";
        String result = TwoStringAreAnagram.checkAnagram(firstString, secondString);
        assertEquals(resultString, result);
    }

    @Test
     void twoSameLengthWordsWithDifferentCharactersAreNotAnagrams() {
        String firstString = "Change";
        String secondString = "Mother";
        String resultString = "Not Anagram";
        String result = TwoStringAreAnagram.checkAnagram(firstString, secondString);
        assertEquals(resultString, result);
    }
}
