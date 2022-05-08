package com.codewars.kyu7.howmanyaresmallerthanme.test;

import org.junit.Test;

import static com.codewars.kyu7.howmanyaresmallerthanme.main.HowManyAreSmallerThanMe.howManyAreSmallerThanMe;
import static org.junit.Assert.assertArrayEquals;


public class HowManyAreSmallerThanMeTest {
    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{1, 1, 0}, howManyAreSmallerThanMe(new int[]{1, 2, 0}));
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, howManyAreSmallerThanMe(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{0, 0, 0}, howManyAreSmallerThanMe(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 1, 0}, howManyAreSmallerThanMe(new int[]{1, 2, 0}));
        assertArrayEquals(new int[]{3, 3, 0, 0, 0}, howManyAreSmallerThanMe(new int[]{1, 1, -1, 0, 0}));
        assertArrayEquals(new int[]{4, 1, 5, 5, 0, 0, 0, 0, 0}, howManyAreSmallerThanMe(new int[]{5, 4, 7, 9, 2, 4, 4, 5, 6}));

    }
}
