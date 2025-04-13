package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class BalancedParenthesesTest {
    @Test
    void parenthesesUnbalancedShouldReturnFalse() {
        String expression = "{{)(}}";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
     void givenBracesUnbalancedShouldReturnFalse() {
        String expression = "({)}";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    void givenAllBalancedShouldReturnTrue() {
        String expression = "[({})]";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    void givenBracesBalancedShouldReturnTrue() {
        String expression = "{}([])";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    void givenBracketsBalancedShouldReturnTrue() {
        String expression = "{()}[[{}]]";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
     void givenOneBracketShouldReturnFalse() {
        String expression = "[";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    void givenNoBracketShouldReturnTrue() {
        String expression = "";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }
}
