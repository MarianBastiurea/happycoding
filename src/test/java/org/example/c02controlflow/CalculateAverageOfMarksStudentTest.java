package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAverageOfMarksStudentTest {

    @Test
    void studentWithNoMarkShouldHave0Average() {
        int[] marks = {};

        double average = CalculateAverageOfMarksStudent.getAverage(marks);

        assertTrue(average == 0D);
    }

    @Test
    void oneNoteShouldAverageItself() {
        int[] marks = {5};

        double average = CalculateAverageOfMarksStudent.getAverage(marks);

        assertTrue(average == 5D);
    }

    @Test
    void twoNotesShouldAverage() {
        int[] marks = {5, 7};

        double average = CalculateAverageOfMarksStudent.getAverage(marks);

        assertTrue(average == 6D);
    }
}