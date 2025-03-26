package com.marianbastiurea.c06challenges;
/*
A field of N x M squares is represented by N lines of exactly M characters each.
  o) The character '*' represents a mine.
  o) The character '.' represents no-mine.

Example input (a 3 x 4 minefield of 12 squares, 2 of which are mines)

3 4
*...
..*.
....

Your task is to write a program to accept this input and produce as output a hint-field of identical dimensions
 where each square is a * for a mine or the number of adjacent mine-squares if the square does not contain
 a mine.

Example output (for the above input)
*211
12*1
0111 */

public class MineField {
    private MineField() {
    }

    public static char[][] hintField(char[][] mineField) {

        int rows = mineField.length;
        int columns = mineField[0].length;

        char[][] hintField = new char[rows][columns];
        char mine = '*';

        // fill hintField with 0,1 or 2 depending on how many mines are around hintField[i][j]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mineField[i][j] == mine) {
                    hintField[i][j] = mine;
                } else {
                    hintField[i][j] = (char) ('0' + countAdjacentMines(mineField, i, j, rows, columns));
                }
            }
        }
        return hintField;
    }

    private static int countAdjacentMines(char[][] field, int i, int j, int rows, int cols) {
        int count = 0;
        for (int x = Math.max(0, i - 1); x < Math.min(rows, i + 2); x++) {
            for (int y = Math.max(0, j - 1); y < Math.min(cols, j + 2); y++) {
                if (field[x][y] == '*') {
                    count++;
                }
            }
        }
        return count;
    }
}

