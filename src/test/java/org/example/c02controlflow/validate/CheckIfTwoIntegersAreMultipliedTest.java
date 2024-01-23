package org.example.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIfTwoIntegersAreMultipliedTest {
    @Test
    public void fourIsAMultipleOf2() {
        int[] myArray = {2, 4};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertTrue(result);
    }

    @Test
    public void fiveIsNotMultipleOf2() {
        int[] myArray = {2, 5};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertFalse(result);
    }
}
