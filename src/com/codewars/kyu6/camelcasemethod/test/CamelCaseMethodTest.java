package com.codewars.kyu6.camelcasemethod.test;

import com.codewars.kyu6.camelcasemethod.main.CamelCaseMethod;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CamelCaseMethodTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", CamelCaseMethod.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCaseMethod.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCaseMethod.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCaseMethod.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCaseMethod.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCaseMethod.camelCase(""));
    }

}
