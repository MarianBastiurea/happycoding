package com.marianbastiurea.c02controlflow.validate;
import static org.junit.jupiter.api.Assertions.*;

import com.marianbastiurea.c02controlflow.validate.NumberIsPrime;
import org.junit.jupiter.api.Test;

public class NumberIsPrimeTest {
    @Test
    public void tenIsNotAPrimeNumber(){
        int number=10;
        boolean result= NumberIsPrime.checkNumber(number);
        assertFalse(result);
    }
    @Test
    public void threeIsPrimeNumber(){
        int number=3;
        boolean result=NumberIsPrime.checkNumber(number);
        assertTrue(result);
    }
    @Test
    public void oneHundredElevenIsNotPrimeNumber(){
        int number=111;
        boolean result=NumberIsPrime.checkNumber(number);
        assertFalse(result);
    }
}
