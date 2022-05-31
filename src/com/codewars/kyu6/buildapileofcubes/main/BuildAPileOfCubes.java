package com.codewars.kyu6.buildapileofcubes.main;

public class BuildAPileOfCubes {
    public static long findNb(long m) {
        long volume = 0;
        long count = 0;
        while (volume < m) {
            volume += count * count * count;
            count++;
        }
        if (volume == m) {
            return --count;
        }
        return -1;
    }
}
