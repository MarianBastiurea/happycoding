package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfTwoIntegersAreMultipliedTest {
    @Test
     void fourIsAMultipleOf2() {
        int[] myArray = {2, 4};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertTrue(result);
    }

    @Test
   void fiveIsNotMultipleOf2() {
        int[] myArray = {2, 5};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertFalse(result);
    }
}
