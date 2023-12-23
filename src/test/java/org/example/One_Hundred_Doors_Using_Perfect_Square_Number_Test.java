package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class One_Hundred_Doors_Using_Perfect_Square_Number_Test {
    @Test
    public void SeventyNine() {
        int DoorsNumber = 79;
        String DoorsStatus = "Closed";
        String result = One_Hundred_Doors_Using_Perfect_Square_Number.CheckStatusDoor(DoorsNumber);
        assertEquals(DoorsStatus, result);
    }

    @Test
    public void Seventeen() {
        int DoorsNumber = 17;
        String DoorsStatus = "Closed";
        String result = One_Hundred_Doors_Using_Perfect_Square_Number.CheckStatusDoor(DoorsNumber);
        assertEquals(DoorsStatus, result);
    }

    @Test
    public void ThirtySix() {
        int DoorsNumber = 36;
        String DoorsStatus = "Open";
        String result = One_Hundred_Doors_Using_Perfect_Square_Number.CheckStatusDoor(DoorsNumber);
        assertEquals(DoorsStatus, result);
    }
}
