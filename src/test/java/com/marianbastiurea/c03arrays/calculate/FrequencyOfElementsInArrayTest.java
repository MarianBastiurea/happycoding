package com.marianbastiurea.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class FrequencyOfElementsInArrayTest {
    @Test
     void given3DifferentNumberFrequencyShouldBe1() {
        int[] myArray = {2, 12, 43};
        int[] result = FrequencyOfElementsInArray.frequencyElement(myArray);
        assertArrayEquals(new int[]{1, 1, 1}, result);
    }

    @Test
     void given2SameNumberFrom3NumberFrequencyShouldBe2ForSameElementsAnd1ForThirdElement() {
        int[] myArray = {25, 25, 43};
        int[] result = FrequencyOfElementsInArray.frequencyElement(myArray);
        assertArrayEquals(new int[]{2, 2, 1}, result);
    }
}
