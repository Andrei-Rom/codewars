package com.codewars.kyu4.rectanglerotation.test;


import com.codewars.kyu4.rectanglerotation.main.RectangleRotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleRotationTest {
    @Test
    public void basicTests() {
        assertEquals(23, RectangleRotation.rectangleRotation(6, 4));
        assertEquals(65, RectangleRotation.rectangleRotation(30, 2));
        assertEquals(49, RectangleRotation.rectangleRotation(8, 6));
        assertEquals(333, RectangleRotation.rectangleRotation(16, 20));
    }
}