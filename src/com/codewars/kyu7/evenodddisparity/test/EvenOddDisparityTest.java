package com.codewars.kyu7.evenodddisparity.test;

import com.codewars.kyu7.evenodddisparity.main.EvenOddDisparity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddDisparityTest {
    @Test
    public void sampleTest() {
        assertEquals(0, EvenOddDisparity.evenOddDisparity(new int[]{0, 1, 2, 3}));
        assertEquals(0, EvenOddDisparity.evenOddDisparity(new int[]{0, 1, 2, 3}));
        assertEquals(0, EvenOddDisparity.evenOddDisparity(new int[]{0, 15, 16, 13, 14, 9, 10, 13, 4, 3}));
        assertEquals(1, EvenOddDisparity.evenOddDisparity(new int[]{13, 6, 8, 15, 4, 8, 13}));
        assertEquals(-2, EvenOddDisparity.evenOddDisparity(new int[]{1, 17, 8, 3, 12, 1}));
    }
}
