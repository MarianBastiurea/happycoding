package org.example.c01declarationsandexpressions;

import org.example.c01declarationsandexpressions.FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharactersTest {
    @Test
        public void Pickoutthelongestsubstring(){
        String myString="pickoutthelongestsubstring";
        String resultString="ubstring";
        String result= FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void Ppppppppppppp(){
        String myString="ppppppppppppppppppppp";
        String resultString="p";
        String result= FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void Xyzxyxyy(){
        String myString="xyzxyzyy";
        String resultString="xyz";
        String result= FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void Microsoft(){
        String myString="microsoft";
        String resultString="micros";
        String result= FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void EmptyString(){
        String myString="";
        String resultString="";
        String result= FindTheLongestSubstringOfAGivenStringWithoutRepeatingCharacters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
}
