package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class StringIsPalindromeTest {
    @Test
     void nullNotPalindrome() {
        char[] string = null;

        boolean result = StringIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    void emptyStringIsNotPalindrome() {
        char[] string = {};

        boolean result = StringIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
     void oneCharIsPalindrome() {
        char[] string = {'a'};

        boolean result = StringIsPalindrome.isPalindrome(string);

        assertTrue(result);
    }

    @Test
     void twoDifferentCharsIsNotPalindrome() {
        //Arrange
        char[] string = {'a', 'b'};

        //Act
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Assert
        assertFalse(result);
    }

    @Test
     void twoSameCharsIsPalindrome() {
        //Given
        char[] string = {'a', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
     void threeDifferentCharsIsNotPalindrome() {
        //Given
        char[] string = {'a', 'a', 'b'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }

    @Test
     void threeCharsSameAsTheirReverseIsPalindrome() {
        //Given
        char[] string = {'a', 'b', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
     void fourCharsSameAsTheirReverseIsPalindrome() {
        //Given
        char[] string = {'a', 'b', 'b', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
     void fourDifferentCharsIsNotPalindrome() {
        //Given
        char[] string = {'a', 'a', 'b', 'a'};

        //When
        boolean result = StringIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
}
