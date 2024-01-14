package org.example.c01operators.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TwoIntegersProductTest {
    @Test
    public void fortyNine() {
        int firstInteger = 7, secondInteger = 7;
        int product = 49;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }

    @Test
    public void eight() {
        int firstInteger = 2, secondInteger = 4;
        int product = 8;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }

    @Test
    public void zero() {
        int firstInteger = 2, secondInteger = 0;
        int product = 0;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }
}
