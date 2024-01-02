package org.example.c03Arrays;

import org.example.c03arrays.CountFrequencyOfElementInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountFrequencyOfElementInArrayTest {
    @Test
    public void OneTime() {
        CountFrequencyOfElementInArray obj = new CountFrequencyOfElementInArray();
        int[] myArray ={2,12,43};
        int[] result = obj.FrequencyElement(myArray);
        assertArrayEquals(result, new int[]{1, 1, 1});
    }

    @Test
    public void TwoTime() {
        CountFrequencyOfElementInArray obj = new CountFrequencyOfElementInArray();
        int[] myArray = {25,25,43};
        int[] result = obj.FrequencyElement(myArray);
        assertArrayEquals(result, new int[]{2, 2, 1});
    }
}
