package com.marianbastiurea.c06challenges;

import com.marianbastiurea.c06challenges.MineField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void givenOneMineInFieldHintFieldWith2ElementsShouldContainAsANumberOnly1() {
        char[][] mineField = {{'*', '.'}};
        char[][] hintField = {{'*', '1'}};
        char[][] result = MineField.hintField(mineField);
        assertArrayEquals(result, hintField);
    }

    @Test
    public void given2MinesIn12ElementsFieldHintFieldShouldContainsOnly0And1And2AsNumber() {
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
    public void given5MinesInMineFieldShouldBeInHitFieldOnlyNumbersFrom0To4() {
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
