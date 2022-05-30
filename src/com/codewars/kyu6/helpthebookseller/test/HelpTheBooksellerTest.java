package com.codewars.kyu6.helpthebookseller.test;

import static org.junit.Assert.*;

import com.codewars.kyu6.helpthebookseller.main.HelpTheBookseller;
import org.junit.Test;

public class HelpTheBooksellerTest {

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                HelpTheBookseller.stockSummary(art, cd));
    }
}
