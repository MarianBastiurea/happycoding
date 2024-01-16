package org.example.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIfTwoIntegersAreMultipliedTest {
    @Test
    public void twoAndFour() {
        int[] myArray = {2, 4};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertTrue(result);
    }

    @Test
    public void twoAndFive() {
        int[] myArray = {2, 5};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertFalse(result);
    }

    @Test
    public void zeroAndZero() {
        int[] myArray = {0, 0};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertFalse(result);
    }

    @Test
    public void fiveAndFive() {
        int[] myArray = {5, 5};
        boolean result = CheckIfTwoIntegersAreMultiplied.checkMultiplied(myArray);
        assertFalse(result);
    }
}
