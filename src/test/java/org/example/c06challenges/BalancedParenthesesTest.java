package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BalancedParenthesesTest {
    @Test
    public void parenthesesUnbalanced() {
        String expression = "{{)(}}";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    public void bracesUnbalanced() {
        String expression = "({)}";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }

    @Test
    public void allBalanced() {
        String expression = "[({})]";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    public void bracesBalanced() {
        String expression = "{}([])";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }

    @Test
    public void bracketsBalanced() {
        String expression = "{()}[[{}]]";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }
    @Test
    public void oneBracket() {
        String expression = "[";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertFalse(result);
    }
    @Test
    public void noBracket() {
        String expression = "";
        boolean result = BalancedParentheses.areParenthesesBalanced(expression);
        assertTrue(result);
    }
}
