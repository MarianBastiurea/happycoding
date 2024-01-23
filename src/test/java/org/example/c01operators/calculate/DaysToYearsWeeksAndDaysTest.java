package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 /*
 Write a code in Java to transform numbers of days in years, weeks and days.

 I create an arrays with length=3. First position is for number of years
        second for number of weeks and last one for number of days
*/

public class DaysToYearsWeeksAndDaysTest {
    @Test
    public void given3660AsNumberOfDaysShouldBeTenLeapYear() {
        int numberOfDays = 3660;
        int[] resultYearsWeeksDays = {10, 0, 0};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

    @Test
    public void given900AsNumberOfDaysShouldBe2Years24WeeksAnd2Days() {
        int numberOfDays = 900;
        int[] resultYearsWeeksDays = {2, 24, 2};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

    @Test
    public void given100AsNumberOfDaysShoulBe14WeeksAnd2Days() {
        int numberOfDays = 100;
        int[] resultYearsWeeksDays = {0, 14, 2};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

}
