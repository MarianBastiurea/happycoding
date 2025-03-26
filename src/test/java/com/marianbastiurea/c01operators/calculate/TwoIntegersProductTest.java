package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoIntegersProductTest {
    @Test
    public void givenPositiveNumberProductShouldBeAPositiveNumber() {
        int firstInteger = 7, secondInteger = 7;
        int product = 49;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }

    @Test
    public void givenOnePositiveNumberAndOtherNegativeNumberProductShouldBeNegativeNumber() {
        int firstInteger = 2, secondInteger = -4;
        int product = -8;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }

    @Test
    public void givenOneNumber0ProductShouldBe0() {
        int firstInteger = 2, secondInteger = 0;
        int product = 0;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }

    @Test
    public void givenBothNegativeNumberProductShouldBePositiveNumber() {
        int firstInteger = -2, secondInteger = -4;
        int product = 8;
        int result = TwoIntegersProduct.findProduct(firstInteger, secondInteger);
        assertEquals(result, product);
    }
}
