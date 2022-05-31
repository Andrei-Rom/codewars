package com.codewars.kyu6.findthemissingletter.test;

import com.codewars.kyu6.findthemissingletter.main.FindTheMissingLetter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class FindTheMissingLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));

        assertEquals('e', FindTheMissingLetter.findMissingLetterBetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.findMissingLetterBetter(new char[] { 'O','Q','R','S' }));
    }
}
