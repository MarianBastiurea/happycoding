package com.marianbastiurea.c07list;

import com.marianbastiurea.c07list.FirstUniqueCharacterInAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringTest {

    @Test
    void position0() {
        String myString = "leetcode";
        int result = 0;
        assertEquals(result, FirstUniqueCharacterInAString.firstUnique(myString));
    }

    @Test
    void position2() {
        String myString = "loveleetcode";
        int result = 2;
        assertEquals(result, FirstUniqueCharacterInAString.firstUnique(myString));
    }

    @Test
    void noPosition2() {
        String myString = "aabb";
        int result = -1;
        assertEquals(result, FirstUniqueCharacterInAString.firstUnique(myString));
    }
}
