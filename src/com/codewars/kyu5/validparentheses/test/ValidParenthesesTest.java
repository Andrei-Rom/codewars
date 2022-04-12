package com.codewars.kyu5.validparentheses.test;

import com.codewars.kyu5.validparentheses.main.ValidParentheses;
import org.junit.Test;

import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


// TODO: Replace examples and use TDD by writing your own tests

public class ValidParenthesesTest {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertTrue(ValidParentheses.validParentheses("()"));
        assertFalse(ValidParentheses.validParentheses("())"));
        assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
        assertTrue(ValidParentheses.validParentheses("adasdasfa"));
        assertFalse(ValidParentheses.validParentheses(")("));
        assertFalse(ValidParentheses.validParentheses("())("));
    }
}
