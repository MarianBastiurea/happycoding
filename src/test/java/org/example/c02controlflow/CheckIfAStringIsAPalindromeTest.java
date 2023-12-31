package org.example.c02controlflow;

import org.example.c02controlflow.CheckIfAStringIsAPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfAStringIsAPalindromeTest {
    @Test
    public void nullNotPalindrome() {
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = null;

        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {};

        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void oneCharIsPalindrome() {
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a'};

        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    public void twoDifferentCharsIsNotPalindrome() {
        //Arrange
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a', 'b'};

        //Act
        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        //Assert
        assertFalse(result);
    }

    @Test
    public void twoSameCharsIsPalindrome() {
        //Given
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a', 'a'};

        //When
        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void threeDifferentCharsIsNotPalindrome() {
        //Given
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a', 'a', 'b'};

        //When
        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }

    @Test
    public void threeCharsSameAsTheirReverseIsPalindrome() {
        //Given
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a', 'b', 'a'};

        //When
        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourCharsSameAsTheirReverseIsPalindrome() {
        //Given
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a', 'b', 'b', 'a'};

        //When
        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourDifferentCharsIsNotPalindrome() {
        //Given
        CheckIfAStringIsAPalindrome checkIfAStringIsAPalindrome = new CheckIfAStringIsAPalindrome();
        char[] string = {'a', 'a', 'b', 'a'};

        //When
        boolean result = checkIfAStringIsAPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
}
