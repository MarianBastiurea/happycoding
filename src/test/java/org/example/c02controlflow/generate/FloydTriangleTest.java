package org.example.c02controlflow.generate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FloydTriangleTest {
    @Test
    public void generateTriangle(){
        int number=6;
        String triangle=FloydTriangle.generateTriangle(number);
        assertEquals("""
                    1
                    0 1
                    1 0 1
                    0 1 0 1
                    1 0 1 0 1
                    0 1 0 1 0 1
                    """,triangle);
    }
}
