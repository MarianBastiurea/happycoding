package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C04P36_Check_A_Password_Test {

    @Test
    void incorrectUserPasswordReturnsIncorrectPasswordMessage() {
        //input
        String password = "1111";
        String userInput = "2222";


        //call function
        String result = C04P36_Check_A_Password.checkPassword(password, userInput);

        //verify result
        assertEquals("Incorrect password", result);
    }

    @Test
    void whenUserInputsCorrectPasswordReturnsCorrectPasswordMessage() {
        //input
        String password = "1111";
        String userInput = "1111";

        //call function
        String result = C04P36_Check_A_Password.checkPassword(password, userInput);

        //verify result
        assertEquals("Correct password", result);
    }
}