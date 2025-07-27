package com.marianbastiurea.c07list;

import com.marianbastiurea.c07list.GroupAndSortByFrequency;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GroupAndSortByFrequencyTest {

    @Test
    void firstShouldBe4WithFrequency2AfterThatShouldBe5WithFrequency2() {
        int[] myArray = {4, 5, 6, 5, 4, 3};
        int[] resultArray = GroupAndSortByFrequency.groupAndSort(myArray);
        int[] result = {4, 4, 5, 5, 3, 6};
        assertArrayEquals(result, resultArray);
    }

    @Test
    void firstShouldBe5WithFrequency3AfterThatShouldBe4WithFrequency2() {
        int[] myArray = {4, 5, 6, 5, 4, 3, 5};
        int[] resultArray = GroupAndSortByFrequency.groupAndSort(myArray);
        int[] result = {5, 5, 5, 4, 4, 3, 6};
        assertArrayEquals(result, resultArray);
    }

    @Test
    void sortedAscendingArrayBecauseNoDuplicates() {
        int[] myArray = {4, 5, 6, 1, 2, 3, 7};
        int[] resultArray = GroupAndSortByFrequency.groupAndSort(myArray);
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(result, resultArray);
    }
}
