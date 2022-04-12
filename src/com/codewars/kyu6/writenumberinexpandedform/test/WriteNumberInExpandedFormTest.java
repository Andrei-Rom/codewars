package com.codewars.kyu6.writenumberinexpandedform.test;

import com.codewars.kyu6.writenumberinexpandedform.main.WriteNumberInExpandedForm;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class WriteNumberInExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
    }
}
