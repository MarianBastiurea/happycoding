package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class C03P38_Check_If_A_String_Is_A_Palindrome_Test {
    @Test
    public void nullNotPalindrome() {
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = null;

        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {};

        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    public void oneCharIsPalindrome() {
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a'};

        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    public void twoDifferentCharsIsNotPalindrome() {
        //Arrange
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a', 'b'};

        //Act
        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        //Assert
        assertFalse(result);
    }

    @Test
    public void twoSameCharsIsPalindrome() {
        //Given
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a', 'a'};

        //When
        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void threeDifferentCharsIsNotPalindrome() {
        //Given
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a', 'a', 'b'};

        //When
        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }

    @Test
    public void threeCharsSameAsTheirReverseIsPalindrome() {
        //Given
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a', 'b', 'a'};

        //When
        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourCharsSameAsTheirReverseIsPalindrome() {
        //Given
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a', 'b', 'b', 'a'};

        //When
        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        //Then
        assertTrue(result);
    }

    @Test
    public void fourDifferentCharsIsNotPalindrome() {
        //Given
        C03P38_Check_If_A_String_Is_A_Palindrome c03P38CheckIfAGeneralNumberIsPalindrome = new C03P38_Check_If_A_String_Is_A_Palindrome();
        char[] string = {'a', 'a', 'b', 'a'};

        //When
        boolean result = c03P38CheckIfAGeneralNumberIsPalindrome.isPalindrome(string);

        //Then
        assertFalse(result);
    }
}
