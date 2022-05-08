package com.codewars.kyu3.psychic.test;

import com.codewars.kyu3.psychic.main.Psychic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RandomTest {
    @Test
    public void testRandom() {
        assertEquals(Psychic.guess(), java.lang.Math.random(), 0);
    }
}
