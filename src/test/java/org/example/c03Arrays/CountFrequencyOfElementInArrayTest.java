package org.example.c03Arrays;

import org.example.c03arrays.CountFrequencyOfElementInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountFrequencyOfElementInArrayTest {
    @Test
    public void OneTime() {
        CountFrequencyOfElementInArray obj = new CountFrequencyOfElementInArray();
        int[] myArray = new int[3];
        myArray[0] = 25;
        myArray[1] = 12;
        myArray[2] = 43;
        int[] result = obj.FrequencyElement(myArray);
        assertArrayEquals(result, new int[]{1, 1, 1});
    }

    @Test
    public void TwoTime() {
        CountFrequencyOfElementInArray obj = new CountFrequencyOfElementInArray();
        int[] myArray = new int[3];
        myArray[0] = 25;
        myArray[1] = 25;
        myArray[2] = 43;
        int[] result = obj.FrequencyElement(myArray);
        assertArrayEquals(result, new int[]{2, 2, 1});
    }
}
