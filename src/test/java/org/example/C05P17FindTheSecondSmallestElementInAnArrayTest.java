package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P17FindTheSecondSmallestElementInAnArrayTest {
    @Test
    public void FiveElements() {
        C05P17FindTheSecondSmallestElementInAnArray obj = new C05P17FindTheSecondSmallestElementInAnArray();
        int[] myArray = new int[5];
        myArray[0] = 0;
        myArray[1] = 9;
        myArray[2] = 4;
        myArray[3] = 6;
        myArray[4] = 5;
        int[] result = obj.SecondSmallestElementInAnArray(myArray);
        assertArrayEquals(result, new int[]{4});
    }
}
