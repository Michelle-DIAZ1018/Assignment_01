package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    private final ValidParentheses validator = new ValidParentheses();

    @Test
    public void testValidCases() {
        assertTrue(validator.isValid("()"));
        assertTrue(validator.isValid("()[]{}"));
        assertTrue(validator.isValid("{[]}"));
        assertTrue(validator.isValid("{{[[(())]]}}")); // Additional complex valid case
    }

    @Test
    public void testInvalidCases() {
        assertFalse(validator.isValid("(]"));
        assertFalse(validator.isValid("([)]"));
        assertFalse(validator.isValid("{[}]"));
        assertFalse(validator.isValid("("));
        assertFalse(validator.isValid("]"));
        assertFalse(validator.isValid("({[)]}")); // Additional edge case
    }

    @Test
    public void testEmptyString() {
        assertTrue(validator.isValid(""));
    }

    @Test
    public void testSingleCharacter() {
        assertFalse(validator.isValid("("));
        assertFalse(validator.isValid(")"));
        assertFalse(validator.isValid("["));
        assertFalse(validator.isValid("]"));
        assertFalse(validator.isValid("{"));
        assertFalse(validator.isValid("}"));
    }
}
