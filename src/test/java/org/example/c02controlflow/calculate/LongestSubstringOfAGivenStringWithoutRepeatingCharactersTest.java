package org.example.c02controlflow.calculate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringOfAGivenStringWithoutRepeatingCharactersTest {
    @Test
        public void pickoutthelongestsubstring(){
        String myString="pickoutthelongestsubstring";
        String resultString="ubstring";
        String result= LongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void ppppppppppppp(){
        String myString="ppppppppppppppppppppp";
        String resultString="p";
        String result= LongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void xyzxyxyy(){
        String myString="xyzxyzyy";
        String resultString="xyz";
        String result= LongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void microsoft(){
        String myString="microsoft";
        String resultString="micros";
        String result= LongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void emptyString(){
        String myString="";
        String resultString="";
        String result= LongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
}
