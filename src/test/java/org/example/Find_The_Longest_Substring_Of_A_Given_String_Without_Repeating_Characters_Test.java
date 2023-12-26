package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters_Test {
    @Test
        public void Pickoutthelongestsubstring(){
        String myString="pickoutthelongestsubstring";
        String resultString="ubstring";
        String result=Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void Ppppppppppppp(){
        String myString="ppppppppppppppppppppp";
        String resultString="p";
        String result=Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void Xyzxyxyy(){
        String myString="xyzxyzyy";
        String resultString="xyz";
        String result=Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void Microsoft(){
        String myString="microsoft";
        String resultString="micros";
        String result=Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
    @Test
    public void EmptyString(){
        String myString="";
        String resultString="";
        String result=Find_The_Longest_Substring_Of_A_Given_String_Without_Repeating_Characters.FindTheLongest(myString);
        assertEquals(result, resultString);
    }
}
