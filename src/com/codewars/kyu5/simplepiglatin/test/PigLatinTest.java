package com.codewars.kyu5.simplepiglatin.test;

import com.codewars.kyu5.simplepiglatin.main.PigLatin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
