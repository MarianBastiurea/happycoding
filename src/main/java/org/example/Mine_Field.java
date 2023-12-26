package org.example;
/*A field of N x M squares is represented by N lines of exactly M characters each.
  o) The character '*' represents a mine.
  o) The character '.' represents no-mine.

Example input (a 3 x 4 mine-field of 12 squares, 2 of which are mines)

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


public class Mine_Field {
    public static char[][] FillMineField(char[][] mineField) {

        int rows = mineField.length;
        int columns = mineField[0].length;

        //create new matrix hintField with same dimension like mineField
        char[][] hintField = new char[rows][columns];

        // fill hintField with 0,1 or 2 depending how many mines are around hintField[i][j]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mineField[i][j] == '*') {
                    hintField[i][j] = '*';
                } else {
                    hintField[i][j] = (char) ('0' + countMines(mineField, i, j, rows, columns));
                }
            }
        }
        return hintField;
    }
    //count how many mines do we have in mineField
        private static int countMines(char[][] field, int i, int j, int rows, int cols) {
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

