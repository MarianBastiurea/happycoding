package org.example.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FrequencyOfElementsInArrayTest {
    @Test
    public void oneTime() {
        FrequencyOfElementsInArray obj = new FrequencyOfElementsInArray();
        int[] myArray ={2,12,43};
        int[] result = obj.frequencyElement(myArray);
        assertArrayEquals(result, new int[]{1, 1, 1});
    }

    @Test
    public void twoTime() {
        FrequencyOfElementsInArray obj = new FrequencyOfElementsInArray();
        int[] myArray = {25,25,43};
        int[] result = obj.frequencyElement(myArray);
        assertArrayEquals(result, new int[]{2, 2, 1});
    }
}