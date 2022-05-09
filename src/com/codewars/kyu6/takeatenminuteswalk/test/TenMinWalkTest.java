package com.codewars.kyu6.takeatenminuteswalk.test;

import com.codewars.kyu6.takeatenminuteswalk.main.TenMinWalk;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TenMinWalkTest {
    @Test
    public void Test() {
        assertTrue("Should return true", TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'w'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));

        assertTrue("Should return true", TenMinWalk.isValid(new char[]{'n', 'e', 'n', 'e', 's', 's', 'w', 'w', 'e', 'w'}));
    }
}
