package com.codewars.kyu6.validbraces.test;

import com.codewars.kyu6.validbraces.main.ValidBraces;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ValidBracesTests {

    private ValidBraces validator = new ValidBraces();

    @Test
    public void testValid() {
        assertEquals(true, validator.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, validator.isValid("[(])"));
    }

}