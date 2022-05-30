package com.codewars.kyu6.validphonenumber.test;

import com.codewars.kyu6.validphonenumber.main.ValidPhoneNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidPhoneNumberTests {
    @Test
    public void tests() {
        assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
    }
}