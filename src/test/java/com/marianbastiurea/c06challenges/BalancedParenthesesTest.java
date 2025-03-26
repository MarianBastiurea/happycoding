package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedParenthesesTest {
    @Test
    public void parenthesesUnbalancedShouldReturnFalse() {
        String expression = "{{)(}}";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    public void givenBracesUnbalancedShouldReturnFalse() {
        String expression = "({)}";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    public void givenAllBalancedShouldReturnTrue() {
        String expression = "[({})]";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    public void givenBracesBalancedShouldReturnTrue() {
        String expression = "{}([])";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    public void givenBracketsBalancedShouldReturnTrue() {
        String expression = "{()}[[{}]]";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    public void givenOneBracketShouldReturnFalse() {
        String expression = "[";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    public void givenNoBracketShouldReturnTrue() {
        String expression = "";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }
}
