package com.codewars.kyu6.bitcounting.test;

import com.codewars.kyu6.bitcounting.main.BitCounting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BitCountingTest {
    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}
