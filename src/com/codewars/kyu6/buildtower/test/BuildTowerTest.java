package com.codewars.kyu6.buildtower.test;

import com.codewars.kyu6.buildtower.main.BuildTower;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildTowerTest {
    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }
}
