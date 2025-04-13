package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AverageOfMarksStudentTest {

    @Test
    void studentWithNoMarkShouldHave0Average() {
        int[] marks = {};

        double average = AverageOfMarksStudent.getAverage(marks);

        assertEquals(0D, average);
    }

    @Test
    void oneNoteShouldAverageItself() {
        int[] marks = {5};

        double average = AverageOfMarksStudent.getAverage(marks);

        assertEquals(5D, average);
    }

    @Test
    void twoNotesShouldAverage() {
        int[] marks = {5, 7};

        double average = AverageOfMarksStudent.getAverage(marks);

        assertEquals(6D, average);
    }
}