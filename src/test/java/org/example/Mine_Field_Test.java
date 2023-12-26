package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Mine_Field_Test {
    @Test
    public void ThreeOrFour(){
        char[][] mineField = {{'*', '.', '.', '.' }, {'.', '.', '*', '.' }, {'.', '.', '.', '.' }};
        char[][]hintField={{'*','2','1','1'},{'1','2','*','1'},{'0','1','1','1'}};
        char[][] result=Mine_Field.FillMineField(mineField);
        assertArrayEquals(result, hintField);
    }
    @Test
    public void FourOrFive(){
        char[][] mineField = {{'.', '.', '.','*', '.' }, {'.', '*', '.', '.','*' },
                {'.', '.', '*', '.','.'},{'*','.','.','.','.'}};
        char[][]hintField={{'1','1','2','*','2'},{'1','*','3','3','*'},
                {'2','3','*','2','1'},{'*','2','1','1','0'}};
        char[][] result=Mine_Field.FillMineField(mineField);
        assertArrayEquals(result, hintField);
    }
}
