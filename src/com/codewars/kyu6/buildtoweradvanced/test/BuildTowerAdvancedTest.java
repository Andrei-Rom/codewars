package com.codewars.kyu6.buildtoweradvanced.test;

import com.codewars.kyu6.buildtoweradvanced.main.BuildTowerAdvanced;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildTowerAdvancedTest {
    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTowerAdvanced.towerBuilder(1, 1, 1)));
        assertEquals(String.join(",", "    **    ", "    **    ", "    **    ", "  ******  ", "  ******  ", "  ******  ", "**********", "**********", "**********"), String.join(",", BuildTowerAdvanced.towerBuilder(3, 2, 3)));
        assertEquals(String.join(",", "          **          ", "        ******        ", "      **********      ", "    **************    ", "  ******************  ", "**********************"), String.join(",", BuildTowerAdvanced.towerBuilder(6, 2, 1)));
    }
}