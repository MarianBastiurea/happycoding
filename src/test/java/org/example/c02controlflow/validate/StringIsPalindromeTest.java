package org.example.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringIsPalindromeTest {
    @Test
    public void nullNotPalindrome() {
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = null;

        boolean result = stringIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {};

        boolean result = stringIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void oneCharIsPalindrome() {
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a'};

        boolean result = stringIsPalindrome.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    public void twoDifferentCharsIsNotPalindrome() {
        //Arrange
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a', 'b'};

        //Act
        boolean result = stringIsPalindrome.isPalindrome(string);

        //Assert
        assertFalse(result);
    }

    @Test
    public void twoSameCharsIsPalindrome() {
        //Given
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a', 'a'};

        //When
        boolean result = stringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void threeDifferentCharsIsNotPalindrome() {
        //Given
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a', 'a', 'b'};

        //When
        boolean result = stringIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }

    @Test
    public void threeCharsSameAsTheirReverseIsPalindrome() {
        //Given
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a', 'b', 'a'};

        //When
        boolean result = stringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourCharsSameAsTheirReverseIsPalindrome() {
        //Given
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a', 'b', 'b', 'a'};

        //When
        boolean result = stringIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourDifferentCharsIsNotPalindrome() {
        //Given
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        char[] string = {'a', 'a', 'b', 'a'};

        //When
        boolean result = stringIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
}
