package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static com.marianbastiurea.c06challenges.FindIfAVowelIsPresentInAString.check;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIfAVowelIsPresentInAStringTest {

    @Test
    void ifStringIsMamaThenReturnTrue(){
        String myString="mama";
        Boolean isTrue=true;
        assertEquals(isTrue,check(myString));
    }

    @Test
    void ifStringIsMMMMMMThenReturnFalse(){
        String myString="mmmmmm";
        Boolean isTrue=false;
        assertEquals(isTrue,check(myString));
    }
}
