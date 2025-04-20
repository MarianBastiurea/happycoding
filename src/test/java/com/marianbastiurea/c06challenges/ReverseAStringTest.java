package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static com.marianbastiurea.c06challenges.ReverseAString.reverseAString;
import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {

    @Test
    void givenString123ShouldReverse321(){
        String myString="123";
        String expectedResult="321";
        assertEquals(expectedResult, reverseAString(myString));
    }

    @Test
    void givenASentenceShouldReturnASentence(){
        String myString="Hello World! Have a nice day!";
        String expectedResult="!yad ecin a evaH !dlroW olleH";
        assertEquals(expectedResult, reverseAString(myString));
    }


}
