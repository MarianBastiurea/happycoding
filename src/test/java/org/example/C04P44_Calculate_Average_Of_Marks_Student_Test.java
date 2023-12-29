package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C04P44_Calculate_Average_Of_Marks_Student_Test {

    @Test
    void studentWithNoMarkShouldHave0Average() {
        int[] marks = {};

        double average = C04P44_Calculate_Average_Of_Marks_Student.getAverage(marks);

        assertTrue(average == 0D);
    }

    @Test
    void oneNoteShouldAverageItself() {
        int[] marks = {5};

        double average = C04P44_Calculate_Average_Of_Marks_Student.getAverage(marks);

        assertTrue(average == 5D);
    }

    @Test
    void twoNotesShouldAverage() {
        int[] marks = {5, 7};

        double average = C04P44_Calculate_Average_Of_Marks_Student.getAverage(marks);

        assertTrue(average == 6D);
    }
}