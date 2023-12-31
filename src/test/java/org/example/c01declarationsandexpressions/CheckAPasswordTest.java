package org.example.c01declarationsandexpressions;

import org.example.c01declarationsandexpressions.CheckAPassword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAPasswordTest {

    @Test
    void incorrectUserPasswordReturnsIncorrectPasswordMessage() {
        //input
        String password = "1111";
        String userInput = "2222";


        //call function
        String result = CheckAPassword.checkPassword(password, userInput);

        //verify result
        assertEquals("Incorrect password", result);
    }

    @Test
    void whenUserInputsCorrectPasswordReturnsCorrectPasswordMessage() {
        //input
        String password = "1111";
        String userInput = "1111";

        //call function
        String result = CheckAPassword.checkPassword(password, userInput);

        //verify result
        assertEquals("Correct password", result);
    }
}