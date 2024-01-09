package org.example.c03arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.junit.jupiter.api.Test;

public class OneHundredDoorsUsingPerfectSquareNumberTest {

    @Test
    public void oneHundredDoors() {
        String[][] resultString = {{"1", "Open"}, {"2", "Closed"}, {"3", "Closed"}, {"4", "Open"}, {"5", "Closed"},
                {"6", "Closed"}, {"7", "Closed"}, {"8", "Closed"}, {"9", "Open"}, {"10", "Closed"}, {"11", "Closed"},
                {"12", "Closed"}, {"13", "Closed"}, {"14", "Closed"}, {"15", "Closed"}, {"16", "Open"}, {"17", "Closed"},
                {"18", "Closed"}, {"19", "Closed"}, {"20", "Closed"}, {"21", "Closed"}, {"22", "Closed"}, {"23", "Closed"},
                {"24", "Closed"}, {"25", "Open"}, {"26", "Closed"}, {"27", "Closed"}, {"28", "Closed"}, {"29", "Closed"},
                {"30", "Closed"}, {"31", "Closed"}, {"32", "Closed"}, {"33", "Closed"}, {"34", "Closed"}, {"35", "Closed"},
                {"36", "Open"}, {"37", "Closed"}, {"38", "Closed"}, {"39", "Closed"}, {"40", "Closed"}, {"41", "Closed"},
                {"42", "Closed"}, {"43", "Closed"}, {"44", "Closed"}, {"45", "Closed"}, {"46", "Closed"}, {"47", "Closed"},
                {"48", "Closed"}, {"49", "Open"}, {"50", "Closed"}, {"51", "Closed"}, {"52", "Closed"}, {"53", "Closed"},
                {"54", "Closed"}, {"55", "Closed"}, {"56", "Closed"}, {"57", "Closed"}, {"58", "Closed"}, {"59", "Closed"},
                {"60", "Closed"}, {"61", "Closed"}, {"62", "Closed"}, {"63", "Closed"}, {"64", "Open"}, {"65", "Closed"},
                {"66", "Closed"}, {"67", "Closed"}, {"68", "Closed"}, {"69", "Closed"}, {"70", "Closed"}, {"71", "Closed"},
                {"72", "Closed"}, {"73", "Closed"}, {"74", "Closed"}, {"75", "Closed"}, {"76", "Closed"}, {"77", "Closed"},
                {"78", "Closed"}, {"79", "Closed"}, {"80", "Closed"}, {"81", "Open"}, {"82", "Closed"}, {"83", "Closed"},
                {"84", "Closed"}, {"85", "Closed"}, {"86", "Closed"}, {"87", "Closed"}, {"88", "Closed"}, {"89", "Closed"},
                {"90", "Closed"}, {"91", "Closed"}, {"92", "Closed"}, {"93", "Closed"}, {"94", "Closed"}, {"95", "Closed"},
                {"96", "Closed"}, {"97", "Closed"}, {"98", "Closed"}, {"99", "Closed"}, {"100", "Open"}};

        String[][] result = OneHundredDoorsUsingPerfectSquareNumber.doorStatus();
        assertArrayEquals(result, resultString);
    }
}

