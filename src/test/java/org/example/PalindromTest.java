package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromTest {
    @Test
    public void nullNotPalindrome() {
        Palindrome palindrome=new Palindrome();
        char[] string= null;

        boolean result= palindrome.isPalindrome(string);

       assertFalse(result);
    }
    @Test
    public void emptyStringIsNotPalindrome() {
        Palindrome palindrome=new Palindrome();
        char[] string = {};

        boolean result= palindrome.isPalindrome(string);

        assertFalse(result);
    }
    @Test
    public void oneCharIsPalindrome() {
        Palindrome palindrome=new Palindrome();
        char[] string = {'a'};

        boolean result= palindrome.isPalindrome(string);

        assertTrue(result);
    }
    @Test
    public void twoDifferentCharsIsNotPalindrome() {
        //Arrange
        Palindrome palindrome=new Palindrome();
        char[] string = {'a','b'};

        //Act
        boolean result= palindrome.isPalindrome(string);

        //Assert
        assertFalse(result);
    }
    @Test
    public void twoSameCharsIsPalindrome() {
        //Given
        Palindrome palindrome=new Palindrome();
        char[] string = {'a','a'};

        //When
        boolean result= palindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }
    @Test
    public void threeDifferentCharsIsNotPalindrome() {
        //Given
        Palindrome palindrome=new Palindrome();
        char[] string = {'a','a','b'};

        //When
        boolean result= palindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
    @Test
    public void threeCharsSameAsTheirReverseIsPalindrome() {
        //Given
        Palindrome palindrome = new Palindrome();
        char[] string = {'a', 'b', 'a'};

        //When
        boolean result = palindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }
    @Test
    public void fourCharsSameAsTheirReverseIsPalindrome() {
        //Given
        Palindrome palindrome = new Palindrome();
        char[] string = {'a', 'b', 'b','a'};

        //When
        boolean result = palindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }
    @Test
    public void fourDifferentCharsIsNotPalindrome() {
        //Given
        Palindrome palindrome=new Palindrome();
        char[] string = {'a','a','b','a'};

        //When
        boolean result= palindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
}
