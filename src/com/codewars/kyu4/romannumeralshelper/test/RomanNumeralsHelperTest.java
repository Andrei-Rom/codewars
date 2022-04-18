package com.codewars.kyu4.romannumeralshelper.test;

import com.codewars.kyu4.romannumeralshelper.main.RomanNumeralsHelper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsHelperTest {

    @Test
    public void testToRoman() throws Exception {
        assertThat("1991 converts to 'I'", RomanNumeralsHelper.toRoman(1991), is("MCMXCI"));
        assertThat("2022 converts to 'II'", RomanNumeralsHelper.toRoman(2022), is("MMXXII"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'MCMXVII' converts to 1917", RomanNumeralsHelper.fromRoman("MCMXVII"), is(1917));
        assertThat("'MMI' converts to 2001", RomanNumeralsHelper.fromRoman("MMI"), is(2001));
    }
}
