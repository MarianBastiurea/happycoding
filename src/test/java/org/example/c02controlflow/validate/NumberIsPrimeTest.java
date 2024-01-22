package org.example.c02controlflow.validate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberIsPrimeTest {
    @Test
    public void tenIsNotAPrimeNumber(){
        int number=10;
        boolean result=NumberIsPrime.checkNumber(number);
        assertFalse(result);
    }
}
