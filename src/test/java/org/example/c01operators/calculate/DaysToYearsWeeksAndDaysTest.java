package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 /*
 I create an arrays with length=3. First position is for number of years
        second for number of weeks and last one for number of days
*/

public class DaysToYearsWeeksAndDaysTest {
    @Test
    public void tenLeapYear() {
        int numberOfDays = 3660;
        int[] resultYearsWeeksDays = {10, 0, 0};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

    @Test
    public void nineHundredDays() {
        int numberOfDays = 900;
        int[] resultYearsWeeksDays = {2, 24, 2};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

    @Test
    public void oneHundredDays() {
        int numberOfDays = 100;
        int[] resultYearsWeeksDays = {0, 14, 2};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

}
