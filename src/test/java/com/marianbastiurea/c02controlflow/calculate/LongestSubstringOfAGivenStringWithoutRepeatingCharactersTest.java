package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringOfAGivenStringWithoutRepeatingCharactersTest {
    @Test
 void pickoutthelongestsubstring() {
        String myString = "pickoutthelongestsubstring";
        String resultString = "ubstring";
        String result = LongestSubstringOfAGivenStringWithoutRepeatingCharacters.findTheLongest(myString);
        assertEquals(result, resultString);
    }

    @Test
     void ppppppppppppp() {
        String myString = "ppppppppppppppppppppp";
        String resultString = "p";
        String result = LongestSubstringOfAGivenStringWithoutRepeatingCharacters.findTheLongest(myString);
        assertEquals(result, resultString);
    }

    @Test
     void xyzxyxyy() {
        String myString = "xyzxyzyy";
        String resultString = "xyz";
        String result = LongestSubstringOfAGivenStringWithoutRepeatingCharacters.findTheLongest(myString);
        assertEquals(result, resultString);
    }

    @Test
     void microsoft() {
        String myString = "microsoft";
        String resultString = "micros";
        String result = LongestSubstringOfAGivenStringWithoutRepeatingCharacters.findTheLongest(myString);
        assertEquals(result, resultString);
    }

    @Test
   void emptyString() {
        String myString = "";
        String resultString = "";
        String result = LongestSubstringOfAGivenStringWithoutRepeatingCharacters.findTheLongest(myString);
        assertEquals(result, resultString);
    }
}
