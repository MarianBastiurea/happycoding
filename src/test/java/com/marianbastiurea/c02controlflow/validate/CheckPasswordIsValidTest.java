package com.marianbastiurea.c02controlflow.validate;

import com.marianbastiurea.c02controlflow.validate.CheckPasswordIsValid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckPasswordIsValidTest {

    @Test
    void incorrectUserPasswordReturnsIncorrectPasswordMessage() {
        //input
        String password = "1111";
        String userInput = "2222";


        //call function
        String result = CheckPasswordIsValid.checkPassword(password, userInput);

        //verify result
        assertEquals("Incorrect password", result);
    }

    @Test
    void whenUserInputsCorrectPasswordReturnsCorrectPasswordMessage() {
        //input
        String password = "1111";
        String userInput = "1111";

        //call function
        String result = CheckPasswordIsValid.checkPassword(password, userInput);

        //verify result
        assertEquals("Correct password", result);
    }
}