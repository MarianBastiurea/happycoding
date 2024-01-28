package com.marianbastiurea.c02controlflow.generate;

import com.marianbastiurea.c02controlflow.generate.Display10Integers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Display10IntegersTest {
    @Test
    public void display10NumberStartingWith1() {
        int number = 1;
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = Display10Integers.find10Integer(number);
        assertArrayEquals(result, myArray);
    }

    @Test
    public void display10NumberStartingWithNegative5() {
        int number = -5;
        int[] myArray = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4};
        int[] result = Display10Integers.find10Integer(number);
        assertArrayEquals(result, myArray);
    }
}
