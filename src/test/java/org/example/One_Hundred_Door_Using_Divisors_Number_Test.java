package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class One_Hundred_Door_Using_Divisors_Number_Test {

    @Test
    public void SeventyNine() {
        int DoorsNumber = 79;
        String DoorsStatus = "Closed";
        String result = One_Hundred_Door_Using_Divisors_Number.OneHundredDivisors(DoorsNumber);
        assertEquals(DoorsStatus, result);
    }

    @Test
    public void Seventeen() {
        int DoorsNumber = 17;
        String DoorsStatus = "Closed";
        String result = One_Hundred_Door_Using_Divisors_Number.OneHundredDivisors(DoorsNumber);
        assertEquals(DoorsStatus, result);
    }

    @Test
    public void ThirtySix() {
        int DoorsNumber = 36;
        String DoorsStatus = "Open";
        String result = One_Hundred_Door_Using_Divisors_Number.OneHundredDivisors(DoorsNumber);
        assertEquals(DoorsStatus, result);
    }
}
