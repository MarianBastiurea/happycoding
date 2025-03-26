package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringIsPalindromeTest {
    @Test
    public void nullNotPalindrome() {
        char[] string = null;

        boolean result = StringIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        char[] string = {};

        boolean result = StringIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void oneCharIsPalindrome() {
        char[] string = {'a'};

        boolean result = StringIsPalindrome.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    public void twoDifferentCharsIsNotPalindrome() {
        //Arrange
        char[] string = {'a', 'b'};

        //Act
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Assert
        assertFalse(result);
    }

    @Test
    public void twoSameCharsIsPalindrome() {
        //Given
        char[] string = {'a', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void threeDifferentCharsIsNotPalindrome() {
        //Given
        char[] string = {'a', 'a', 'b'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }

    @Test
    public void threeCharsSameAsTheirReverseIsPalindrome() {
        //Given
        char[] string = {'a', 'b', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourCharsSameAsTheirReverseIsPalindrome() {
        //Given
        char[] string = {'a', 'b', 'b', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourDifferentCharsIsNotPalindrome() {
        //Given
        char[] string = {'a', 'a', 'b', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
}
