package com.codewars.kyu6.splitstrings.test;

import org.junit.Test;

import static com.codewars.kyu6.splitstrings.main.SplitStrings.splitStrings;
import static org.junit.Assert.assertArrayEquals;

public class SplitStringsTest {
    @Test
    public void basicTest() {
        assertArrayEquals(new String[]{"ab", "c_"}, splitStrings("abc"));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, splitStrings("abcdef"));
    }
}
