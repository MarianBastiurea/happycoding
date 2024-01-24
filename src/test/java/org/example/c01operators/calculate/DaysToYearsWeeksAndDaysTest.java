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
    public void given366AsNumberOfDaysShouldBeOneYearAndOneDay() {
        int numberOfDays = 366;
        int[] resultYearsWeeksDays = {1, 0, 0};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

    @Test
    public void given8AsNumberOfDaysShouldBe0Years1WeeksAnd1Days() {
        int numberOfDays = 8;
        int[] resultYearsWeeksDays = {0, 1, 1};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

    @Test
    public void given1461AsNumberOfDaysShouldBe4Years0WeeksAnd0Days() {
        int numberOfDays = 1461;
        int[] resultYearsWeeksDays = {4, 0, 0};
        int[] result = DaysToYearsWeeksAndDays.findYearsWeeksDays(numberOfDays);
        assertArrayEquals(result, resultYearsWeeksDays);
    }

}
