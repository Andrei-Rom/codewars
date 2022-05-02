package com.codewars.kyu8.volumeofacuboid.test;

import com.codewars.kyu8.volumeofacuboid.main.VolumeOfCuboid;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeOfCuboidTest {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, VolumeOfCuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfCuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}
