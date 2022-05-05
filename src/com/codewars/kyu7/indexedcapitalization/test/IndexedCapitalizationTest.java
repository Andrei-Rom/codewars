package com.codewars.kyu7.indexedcapitalization.test;

import org.junit.runners.JUnit4;
import org.junit.Test;

import static com.codewars.kyu7.indexedcapitalization.main.IndexedCapitalization.capitalize;
import static org.junit.Assert.assertEquals;

public class IndexedCapitalizationTest {
    @Test
    public void basicTest(){
        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", capitalize("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", capitalize("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", capitalize("codewarriors", new int[]{5}));
    }
}
