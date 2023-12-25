package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Check_If_Two_String_Are_An_Anagram_Test {
    @Test
    public void StoneToTones(){
        String FirstString="Stone";
        String SecondString="Tones";
        String ResultString="Anagram";
        String result=Check_If_Two_String_Are_An_Anagram.CheckAnagram(FirstString,SecondString);
        assertEquals(ResultString,result);
    }
    @Test
    public void StoneToMother(){
        String FirstString="Stone";
        String SecondString="Mother";
        String ResultString="Not Anagram";
        String result=Check_If_Two_String_Are_An_Anagram.CheckAnagram(FirstString,SecondString);
        assertEquals(ResultString,result);
    }
    @Test
    public void ChangeToMother(){
        String FirstString="Change";
        String SecondString="Mother";
        String ResultString="Not Anagram";
        String result=Check_If_Two_String_Are_An_Anagram.CheckAnagram(FirstString,SecondString);
        assertEquals(ResultString,result);
    }
}
