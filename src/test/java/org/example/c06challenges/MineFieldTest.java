package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void oneMineInField() {
        char[][] mineField = {{'*', '.'}};
        char[][] hintField = {{'*', '1'}};
        char[][] result = MineField.hintField(mineField);
        assertArrayEquals(result, hintField);
    }

    @Test
    public void threeOrFour() {
        char[][] mineField = {
                {'*', '.', '.', '.'},
                {'.', '.', '*', '.'},
                {'.', '.', '.', '.'}};
        char[][] hintField = {
                {'*', '2', '1', '1'},
                {'1', '2', '*', '1'},
                {'0', '1', '1', '1'}};
        char[][] result = MineField.hintField(mineField);
        assertArrayEquals(result, hintField);
    }

    @Test
    public void fourOrFive() {
        char[][] mineField = {
                {'.', '.', '.', '*', '.'},
                {'.', '*', '.', '.', '*'},
                {'.', '.', '*', '.', '.'},
                {'*', '.', '.', '.', '.'}};
        char[][] hintField = {
                {'1', '1', '2', '*', '2'},
                {'1', '*', '3', '3', '*'},
                {'2', '3', '*', '2', '1'},
                {'*', '2', '1', '1', '0'}};
        char[][] result = MineField.hintField(mineField);
        assertArrayEquals(result, hintField);
    }
}
