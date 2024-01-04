package org.example.c02controlflow;

import org.example.c02controlflow.checkIfTwoStringAreAnAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkIfTwoStringAreAnAnagramTest {
    @Test
    public void twoWordsWithSameCharactersAreAnagram() {
        String FirstString = "Stone";
        String SecondString = "Tones";
        String ResultString = "Anagram";
        String result = checkIfTwoStringAreAnAnagram.CheckAnagram(FirstString, SecondString);
        assertEquals(ResultString, result);
    }

    @Test
    public void twoWordsWithDifferentLengthsAreNotAnagram() {
        String FirstString = "Stone";
        String SecondString = "Mother";
        String ResultString = "Not Anagram";
        String result = checkIfTwoStringAreAnAnagram.CheckAnagram(FirstString, SecondString);
        assertEquals(ResultString, result);
    }

    @Test
    public void twoSameLengthWordsWithDifferentCharactersAreNotAnagrams() {
        String FirstString = "Change";
        String SecondString = "Mother";
        String ResultString = "Not Anagram";
        String result = checkIfTwoStringAreAnAnagram.CheckAnagram(FirstString, SecondString);
        assertEquals(ResultString, result);
    }
}
